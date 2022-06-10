import {BaseCrudService} from "../../core/base.crud.service";
import {Cliente} from "../../model/pessoa/cliente";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class ClienteService extends BaseCrudService<Cliente> {

  constructor(public http: HttpClient) {
    super(http, "/cliente");
  }

}
