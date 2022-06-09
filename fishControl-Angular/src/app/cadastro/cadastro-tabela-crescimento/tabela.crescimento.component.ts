import {Component} from "@angular/core";
import {BaseCrudComponent} from "../../core/base.crud.component";
import {AlertModelService} from "../../services/alert.model.service";
import {TabelaCrescimento} from "../../model/tabela.crescimento";
import {TabelaCrescimentoService} from "../../services/tabela.crescimento.service";

@Component({
  selector: 'tabela-crescimento',
  templateUrl: './tabela.crescimento.component.html',
  styleUrls: ['./tabela.crescimento.component.css']
})
export class TabelaCrescimentoComponent extends BaseCrudComponent<TabelaCrescimento> {

  filterDataSource: TabelaCrescimento[]=[];
  constructor(public mainService: TabelaCrescimentoService,
              public alertService: AlertModelService) {
    super(mainService,alertService
    )
  }

  ngOnInit() {
    this.filtro()
    this.filter = new TabelaCrescimento();
  }

  filtro(){
    setTimeout(()=>{
      this.filterDataSource = [];
      if ((this.mainForm.controls.semana.value=="" || this.mainForm.controls.semana.value==undefined) &&
          (this.mainForm.controls.peso.value=="" || this.mainForm.controls.peso.value==undefined)) {
          this.filterDataSource = this.dataSource;
          return;
      }
      this.dataSource.forEach(dado => {
        if(this.mainForm.controls.semana.value>0) {
          if (dado.semana == this.filter.semana) {
            if(this.filterDataSource.indexOf(dado)<0){
              this.filterDataSource.push(dado);
            }
          }
        }
        if(this.mainForm.controls.peso.value>0) {
          if (!(dado.pesoInicial > this.filter.pesoInicial || dado.pesoFinal < this.filter.pesoInicial)) {
            if(this.filterDataSource.indexOf(dado)<0){
              this.filterDataSource.push(dado);
            }
          }
        }
      })
    },100)
  }

}
