import {Component, Input, ViewChild} from "@angular/core";
import {TypeAlertEnum} from "../../model/type-alert-enum";
import {BsModalRef} from "ngx-bootstrap/modal";

@Component({
  selector: 'alert',
  template: `
    <div class="alert alert-{{type}} no-margim" role="alert">
      {{message}}
      <button type="button" class="close" data-dismiss="alert" aria-label="Close" (click)="onClose()">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>`,
  styleUrls: ['./alert.modal.component.css']
})
export class AlertModalComponent {

  @ViewChild('confirm') confirm;

  @Input() message: string = 'Erro ao carregar dados do servidor.';
  @Input() type:string = TypeAlertEnum.SUCCESS;

  constructor(public bsModelRef: BsModalRef) {
  }

  onClose() {
    this.bsModelRef.hide();
  }
}
