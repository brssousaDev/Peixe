import {Injectable} from "@angular/core";
import {BaseCrudService} from "../../core/base.crud.service";
import {HttpClient} from "@angular/common/http";
import {Responsavel} from "../../model/pessoa/responsavel";

@Injectable({
  providedIn: "root"
})
export class ResponsavelServiceextends extends BaseCrudService<Responsavel>{

  constructor(public http: HttpClient) {
    super(http, "/responsavel");
  }
}
