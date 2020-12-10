import {IVerpakking} from './verpakking';
import {Aflevermethode} from './aflevermethode';

export interface IRecept {
    id: number;
    verpakkingen: IVerpakking[];
    bsn: string;
    voorschrijfDatum: Date;
    afleverMethode: Aflevermethode;
    eindDatum: Date;
}
