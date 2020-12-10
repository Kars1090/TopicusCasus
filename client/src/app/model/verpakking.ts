import {Eenheid} from './eenheid';
import {IMedicijn} from './medicijn';

export interface IVerpakking {
  id: number;
  eenheid: Eenheid;
  medicijn: IMedicijn;
  aantal: number;
  tablettenPerStrip: number;
  milliliterPerFlesje: number;
  overig: number;
}
