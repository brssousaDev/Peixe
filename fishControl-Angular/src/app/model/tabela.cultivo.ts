import {Tanque} from "./tanque";
import {Peixe} from "./peixe";
import {TabelaCrescimento} from "./tabela.crescimento";

export class TabelaCultivo{

  id: number;
  tanque: Tanque;
  peixe: Peixe;
  semana: TabelaCrescimento;
  quantidade: number;
  ultimaAtualizacao: Date;

}
