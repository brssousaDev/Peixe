import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Usuario} from "../model/usuario";
import {BaseCrudService} from "../core/base.crud.service";

@Injectable({
  providedIn: "root"
})
export class UsuarioService extends BaseCrudService<Usuario>{

  constructor(public http: HttpClient) {
    super(http, "/usuario");
  }
}
