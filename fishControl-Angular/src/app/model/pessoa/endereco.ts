import {Estados} from "./estados";

export class Endereco {

  id: number;
  cep: number;
  rua: string;
  numero: number;
  cidade: string;
  estado: Estados;
  complemento: string;
}
