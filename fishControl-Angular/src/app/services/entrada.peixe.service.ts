import {Injectable} from "@angular/core";
import {BaseCrudService} from "../core/base.crud.service";
import {EntradaPeixe} from "../model/entrada.peixe";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class EntradaPeixeService extends BaseCrudService<EntradaPeixe>{

  constructor(public http: HttpClient) {
    super(http, "/entrada-peixe");
  }
}
