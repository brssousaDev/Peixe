import {HttpClient} from "@angular/common/http";
import {BaseCrudService} from "../../core/base.crud.service";
import {Contato} from "../../model/pessoa/contato";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: "root"
})
export class ContatoService extends BaseCrudService<Contato>{

  constructor(public http: HttpClient) {
    super(http, "/contato");
  }
}
