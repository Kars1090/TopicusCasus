import {Component, OnDestroy, OnInit} from '@angular/core';
import {IVerpakking} from '../../model/verpakking';
import {VerpakkingService} from '../../services/verpakking.service';
import {ReceptService} from '../../services/recept.service';
import {Eenheid} from '../../model/eenheid';
import {FormArray, FormBuilder, FormControl} from '@angular/forms';
import {Aflevermethode} from '../../model/aflevermethode';
import {DatePipe} from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, OnDestroy {
  title = 'TopicusCasus';

  verpakkingen: IVerpakking[];
  receptForm;

  constructor(private verpakkingService: VerpakkingService,
              private receptService: ReceptService,
              private formBuilder: FormBuilder,
              public datePipe: DatePipe) {

  }

  ngOnInit(): void {
    this.verpakkingService.getVerpakkingen()
      .subscribe(verpakkingen => this.verpakkingen = verpakkingen as IVerpakking[]);
    this.receptForm = this.formBuilder.group({
      verpakkingen: this.formBuilder.array([]
        .map(v => this.getVerpakkingEntry(v))),
      bsn: null,
      voorschrijfDatum: Date.now(),
      gebruikersVoorschrift: null,
      afleverMethode: Aflevermethode.AFHALEN,
      eindDatum: null
    });
  }

  ngOnDestroy(): void {
    this.verpakkingen = null;
  }

  onSaveRecept(receptData) {
    this.receptService.postRecept(receptData).subscribe(result => console.log(result));
  }

  verpakkingIsEenheidStrips(verpakking: IVerpakking): boolean {
    return verpakking.eenheid.toString(10) === Eenheid[Eenheid.STRIPS];
  }

  verpakkingIsEenheidFlesjes(verpakking: IVerpakking): boolean {
    return verpakking.eenheid.toString(10) === Eenheid[Eenheid.FLESJE];
  }

  verpakkingIsEenheidOverig(verpakking: IVerpakking): boolean {
    return verpakking.eenheid.toString(10) === Eenheid[Eenheid.OVERIG];
  }

  getTodayDateString(): string {
    return this.datePipe.transform(Date.now(), 'yyyy-MM-dd');
  }

  getVerpakkingForm() {
    return this.receptForm.get('verpakkingen') as FormArray;
  }

  addVerpakking(v?: IVerpakking) {
    const verpakking = this.getVerpakkingEntry(v);
    this.getVerpakkingForm().push(verpakking);
  }

  private getVerpakkingEntry(v?) {
    return this.formBuilder.group({
      id: [v ? v.id : null],
      eenheid: [v ? v.eenheid : null],
      medicijn: [v ? v.medicijn : null],
      aantal: [v ? v.aantal : 0],
      tablettenPerStrip: [v ? v.tablettenPerStrip : 0],
      milliliterPerFlesje: [v ? v.milliliterPerFlesje : 0],
      overig: [v ? v.overig : 0],
      gebruiksVoorschrift: '',
    });
  }
}
