import {BaseCrudService} from "../core/base.crud.service";
import {Temperatura} from "../model/temperatura";
import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class TemperaturaService extends BaseCrudService<Temperatura> {

  constructor(public http: HttpClient) {
    super(http, "/temperatura");
  }
}
