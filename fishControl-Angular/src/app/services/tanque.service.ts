import {BaseCrudService} from "../core/base.crud.service";
import {Tanque} from "../model/tanque";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class TanqueService  extends BaseCrudService<Tanque> {

  constructor(public http: HttpClient) {
    super(http, "/tanque");
  }
}
