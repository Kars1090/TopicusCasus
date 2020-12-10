import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {IRecept} from '../model/recept';

@Injectable({
  providedIn: 'root'
})
export class ReceptService {

  constructor(private http: HttpClient) {
  }

  getRecepten() {
    return this.http.get('http://localhost:8080/verpakkingen');
  }

  postRecept(recept: IRecept) {
    console.log(recept);
    return this.http.post<IRecept>('http://localhost:8080/recepten', recept);
  }
}
