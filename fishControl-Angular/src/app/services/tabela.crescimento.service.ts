import {Injectable} from "@angular/core";
import {BaseCrudService} from "../core/base.crud.service";
import {HttpClient} from "@angular/common/http";
import {TabelaCrescimento} from "../model/tabela.crescimento";

@Injectable({
  providedIn: "root"
})
export class TabelaCrescimentoService extends BaseCrudService<TabelaCrescimento> {

  constructor(public http: HttpClient) {
    super(http, "/tabela-crescimento");
  }
}
