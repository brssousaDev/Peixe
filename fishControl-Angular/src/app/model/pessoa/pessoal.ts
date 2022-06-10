import {Responsavel} from "./responsavel";
import {Contato} from "./contato";
import {Endereco} from "./endereco";

export class Pessoa {

  id: number;
  nome: string;
  cpf_cnpj: number;
  responsavelList: Responsavel[]=[];
  contatoList: Contato[] = [];
  endereco: Endereco;

}
