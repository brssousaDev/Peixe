import {Component} from "@angular/core";
import {BaseCrudComponent} from "../../core/base.crud.component";
import {AlertModelService} from "../../services/alert.model.service";
import {Temperatura} from "../../model/temperatura";
import {TemperaturaService} from "../../services/temperatura.service";
import {MESES, Meses} from "../../util/apis/meses";

@Component({
  selector: 'cad-temperatura',
  templateUrl: './cadastro.temperatura.component.html',
  styleUrls: ['./cadastro.temperatura.component.css']
})
export class CadastroTemperaturaComponent extends BaseCrudComponent<Temperatura> {

  meses: Meses[]=[];

  constructor(public mainService: TemperaturaService,
              public alertService: AlertModelService) {
    super(mainService,alertService)
  }

  ngOnInit() {
    this.init();
    this.meses = MESES;
  }

  clean() {
    this.init();
    this.mainForm.controls.mes.reset();
    super.clean();
  }

  afterSave() {
    this.init()
    super.afterSave();
  }

  init(){
    this.filter = new Temperatura();
    this.filter.temperatura = 20;
    this.filter.porcentagem = 100;
  }

  mesDisplay(mes: number): string {
    let data: string;
    MESES.forEach( item => {
      if(item.mes == mes) {
        data = item.nome;
      }
    })
    return data;
  }

  validator() {
    if(this.isNew()){
      let index = this.dataSource.findIndex( value => {
        return value.mes == this.filter.mes;
      })
      if(index > -1){
        this.alertService.showAlertError("Ja existe registro salvo para este mês. " + this.mesDisplay(this.filter.mes));
        return;
      }
    }
    super.validator();
  }
}
