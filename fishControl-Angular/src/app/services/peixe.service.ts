import {Injectable} from "@angular/core";
import {BaseCrudService} from "../core/base.crud.service";
import {Peixe} from "../model/peixe";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class PeixeService extends BaseCrudService<Peixe> {

  constructor(public http: HttpClient) {
    super(http, "/peixe");
  }
}
