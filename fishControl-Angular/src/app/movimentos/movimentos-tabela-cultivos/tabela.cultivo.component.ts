import {Component} from "@angular/core";
import {BaseCrudComponent} from "../../core/base.crud.component";
import {AlertModelService} from "../../services/alert.model.service";
import {TabelaCultivo} from "../../model/tabela.cultivo";
import {TabelaCultivoService} from "../../services/tabela.cultivo.service";

@Component({
  selector: 'tabela-cultivo',
  templateUrl: './tabela.cultivo.component.html',
  styleUrls: ['./tabela.cultivo.component.css']
})
export class TabelaCultivoComponent extends BaseCrudComponent<TabelaCultivo> {

  tabelaCultivoList: TabelaCultivo[]=[];
  constructor(public mainService: TabelaCultivoService,
              public alertService: AlertModelService) {
    super(mainService,alertService
    )
  }

  ngOnInit() {
    this.filter = new TabelaCultivo();
    setTimeout(()=>{
      this.tabelaCultivoList = this.dataSource.sort((a, b) => (a.tanque.tanque < b.tanque.tanque) ? -1 : 1);
    },100)
  }

}
