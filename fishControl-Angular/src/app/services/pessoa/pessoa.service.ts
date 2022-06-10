import {HttpClient} from "@angular/common/http";
import {BaseCrudService} from "../../core/base.crud.service";
import {Pessoa} from "../../model/pessoa/pessoal";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: "root"
})
export class PessoaService extends BaseCrudService<Pessoa>{

  constructor(public http: HttpClient) {
    super(http, "/pessoa");
  }
}
