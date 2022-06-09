import {Component, EventEmitter, Input, Output} from "@angular/core";

@Component({
  selector: 'header',
  template: `
    <div class="clearfix" style="height: 70px">
      <h3 class="text-muted conteudo float-left">{{ modoEdit ? editTitulo : titulo }}</h3>
      <div *ngIf="!modoList">
        <div class="form-group" align="rigth">
          <button type="button" class="btn btn-outline-danger float-right" (click)="sair()">
            <i class="bi bi-x-circle"></i> Sair
          </button>
          <button type="reset" class="btn btn-outline-secondary float-right" (click)="runClenButtonAction($event)">
            <i class="bi bi-trash"></i> Limpar
          </button>
          <button *ngIf="!modoEdit" type="button" class="btn btn-outline-success float-right"
                  (click)="runSaveButtonAction($event)">
            <i class="bi bi-save"></i> Salvar
          </button>
          <button *ngIf="modoEdit" type="button" class="btn btn-outline-success float-right "
                  (click)="runSaveButtonAction($event)">
            <i class="bi bi-check-square"></i> Atualizar
          </button>
          <ng-content></ng-content>
        </div>
      </div>
    </div>`,
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  @Input() titulo: string;
  @Input() editTitulo: string;
  @Input() modoEdit: boolean;
  @Input() modoList: boolean;
  @Output() onClear = new EventEmitter<any>();
  @Output() onChange = new EventEmitter<any>();



  constructor() {
  }

  runClenButtonAction(event) {
    this.onClear.emit(event);
  }

  runSaveButtonAction(event) {
    this.onChange.emit(event);
  }

  sair() {}
}
