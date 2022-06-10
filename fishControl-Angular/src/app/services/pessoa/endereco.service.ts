import {Injectable} from "@angular/core";
import {BaseCrudService} from "../../core/base.crud.service";
import {HttpClient} from "@angular/common/http";
import {Endereco} from "../../model/pessoa/endereco";

@Injectable({
  providedIn: "root"
})
export class EnderecoService extends BaseCrudService<Endereco>{

  constructor(public http: HttpClient) {
    super(http, "/endereco");
  }
}
