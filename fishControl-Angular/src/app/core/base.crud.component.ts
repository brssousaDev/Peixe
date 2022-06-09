import {Directive, Input, OnInit, QueryList, ViewChild, ViewChildren} from "@angular/core";
import {AlertModelService} from "../services/alert.model.service";
import {BsModalRef} from "ngx-bootstrap/modal";
import {compare, NgbdSortableHeader, SortEvent} from "../util/sort/NgbdSortableHeader";
import {TypeAlertEnum} from "../model/type-alert-enum";
import {ValidatorEnum} from "../model/validator.enum";
import {FormGroup} from "@angular/forms";
import {error} from "@angular/compiler/src/util";

@Directive()
export class BaseCrudComponent<T> implements OnInit {

  @ViewChild('mainForm') mainForm: FormGroup;
  @ViewChildren(NgbdSortableHeader) headers: QueryList<NgbdSortableHeader>;
  @Input() dataSource: T[]=[];
  @Input() filter: T;

  editMode: boolean = false;
  search: string;
  ref: any;
  arrayRef: any[];

  private bsModelRef: BsModalRef
  protected service: any;
  protected alertService: AlertModelService;
  classButton: string = 'btn btn-outline-secondary float-right';
  validar: string;

  oculta: boolean = false;

  msgError: string;

  constructor(mainservice: any,
              alertService: AlertModelService,
              private populaDataSource: boolean = true) {
    this.service = mainservice;
    this.alertService = alertService;
    this.list();
  }

  ngOnInit(): void {
  }

  onSort({column, direction}: SortEvent) {

    this.headers.forEach(header => {
      if (header.sortable !== column) {
        header.direction = '';
      }
    });

    if (direction === '' || column === '') {
      column = "id";
      this.dataSource.sort((a,b) => a[column] - b[column]);
    } else {
      this.dataSource = [...this.dataSource].sort((a, b) => {
        const res = compare(a[column].toLowerCase(), b[column].toLowerCase());
        return direction === 'asc' ? res : -res;
      });
    }
  }

  getMainService() {
    this.update(this.filter);
  }

  clean() {
    this.editMode = false;
  }

  list() {
    if(this.populaDataSource) {
      this.service.list().subscribe( dados => {
          this.dataSource = dados
        },
        error => this.alertService.showAlertError('Erro ao carregar dados do servidor.'));
    }
  }

  edit(dados: T){
    if(dados!=null){
      this.filter = dados;
      this.mode();
    } else {
      this.filter = null;
      this.mode();
    }
  }

  confirm(template: any, dados?: any, array?: []) {
    if(dados) {
      this.ref = dados;
      this.arrayRef = array;
      this.bsModelRef = this.alertService.showConfirmMessage(template)
    }
  }

  delete() {
    this.service.delete(this.ref).subscribe()
    this.bsModelRef.hide();
    this.alertService.showAlertSuccess(`Registro ${this.ref} removido com sucesso.`)
    this.afterDelete();
    this.reFlash();
  }

  onDeclined() {
    this.bsModelRef.hide();
  }

  private save(dados: T) {
    if(dados){
      this.service.save(dados).subscribe( dados => {
            this.filter = dados;
            this.mainForm.reset();
            this.editMode = false;
            this.alertService.showAlertSuccess('Registro Salvo com Sucesso.')
            this.afterSave();
            this.reFlash();

          },
          error => error.error ?
            this.alertService.showAlertError(error.error) :
            this.alertService.showAlertError('Erro ao Salvar dados no servidor.'));
    }
  }

  private update(dados: T) {
    this.save(dados);
  }

  private reFlash() {
    setTimeout(x=> {
      this.list();
    }, 1000);
  }

  private mode() {
    this.editMode = false;
    if(this.filter){
      this.editMode = true;
    }
  }

  validator() {
    if (!this.mainForm.valid) {
      if(this.msgError == null || this.msgError == ""){
        this.msgError = 'Campo obrigatótio.';
      }
      this.alertService.showAlertError('Foram encontrados erros no Formulario.');
      this.validar = ValidatorEnum.VALIDATED;
      return;
    }
    this.getMainService();
  }

  isNew(): boolean{
    if(this.filter['id']==null){
      return true;
    } else {
      return false;
    }
  }

  afterSave(){}

  afterDelete(){}

  sort(dados: any[], comparation: string): any[] {
    return dados.sort((a,b) =>
        (a.comparation < b.comparation) ? -1 : 1)
  }
}
