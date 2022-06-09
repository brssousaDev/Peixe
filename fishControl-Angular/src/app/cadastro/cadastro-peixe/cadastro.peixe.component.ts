import {Component} from "@angular/core";
import {BaseCrudComponent} from "../../core/base.crud.component";
import {AlertModelService} from "../../services/alert.model.service";
import {Peixe} from "../../model/peixe";
import {PeixeService} from "../../services/peixe.service";

@Component({
  selector: 'cad-peixe',
  templateUrl: './cadastro.peixe.component.html',
  styleUrls: ['./cadastro.peixe.component.css']
})
export class CadastroPeixeComponent extends BaseCrudComponent<Peixe> {


  constructor(public mainService: PeixeService,
              public alertService: AlertModelService) {
    super(mainService,alertService)
  }

  ngOnInit() {
    this.filter = new Peixe();
  }

  clean() {
    this.filter = new Peixe();
    super.clean();
  }
}
