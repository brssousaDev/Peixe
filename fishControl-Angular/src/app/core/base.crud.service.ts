import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

export class BaseCrudService<T> {

  protected readonly API = 'http://localhost:8080';
  protected _path: string;
  protected _http: HttpClient;
  protected httpOptions = { headers: new HttpHeaders({ 'Content-Type': 'application/json' })}
  constructor(http: HttpClient, path: string) {
    this._http = http;
    this._path = path;
  }

  list() {
    return this._http.get<T[]>(this.API + this._path + "/list");
  }

  save(dados: any) {
    if(dados.id){
      return this._http.put(this.API + this._path + "/edit", dados);
    } else {
      return this._http.post(this.API + this._path + "/create", dados);
    }
  }

  update(dados: any) {
    this.save(dados);
  }

  getById(id: number): Observable<T> {
    return this._http.get<T>(this.API + this._path + "/list/" + id, this.httpOptions);
  }

  delete(id: number) {
    return this._http.delete<T>(this.API + this._path + "/delete/" + id, this.httpOptions);
  }

}
