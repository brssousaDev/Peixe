import {Tanque} from "./tanque";
import {Peixe} from "./peixe";

export class EntradaPeixe {

  id: number;

  quantidade: number;

  peso: number;

  dataEntrada: Date;

  valor: number;

  tanque: Tanque;

  peixe: Peixe;
}
