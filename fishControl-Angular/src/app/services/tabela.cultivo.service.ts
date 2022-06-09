import {BaseCrudService} from "../core/base.crud.service";
import {TabelaCultivo} from "../model/tabela.cultivo";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Tanque} from "../model/tanque";
import {Observable} from "rxjs";

@Injectable({
  providedIn: "root"
})
export class TabelaCultivoService extends BaseCrudService<TabelaCultivo> {

  constructor(public http: HttpClient) {
    super(http, "/tabela-cultivo");
  }

  getByTanque(id: number) {
    return this._http.get<TabelaCultivo>(this.API + this._path + "/tanque/" + id);
  }
}
