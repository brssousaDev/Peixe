import {Component} from "@angular/core";
import {BaseCrudComponent} from "../../core/base.crud.component";
import {AlertModelService} from "../../services/alert.model.service";
import {Cliente} from "../../model/pessoa/cliente";
import {ClienteService} from "../../services/pessoa/cliente.service";

@Component({
  selector: 'cadastro-cliente',
  templateUrl: './cadastro.cliente.component.html',
  styleUrls: ['./cadastro.cliente.component.css']
})
export class CadastroClienteComponent extends BaseCrudComponent<Cliente> {


  constructor(public mainService: ClienteService,
              public alertService: AlertModelService) {
    super(mainService,alertService)
  }

  ngOnInit() {
    this.filter = new Cliente();
  }

  clean() {
    this.filter = new Cliente();
    super.clean();
  }
}
