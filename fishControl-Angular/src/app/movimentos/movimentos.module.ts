import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {FormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {CommunsModule} from "../communs/communs.module";
import {UtilModule} from "../util/util.module";
import {BsModalRef, BsModalService} from "ngx-bootstrap/modal";
import {EntradaPeixeService} from "../services/entrada.peixe.service";
import {EntradaPeixeComponent} from "./movimentos-entrada-peixe/entrada.peixe.component";
import {TanqueService} from "../services/tanque.service";
import {PeixeService} from "../services/peixe.service";
import {NgxMaskModule} from "ngx-mask";
import {TabelaCultivoComponent} from "./movimentos-tabela-cultivos/tabela.cultivo.component";
import {TabelaCrescimentoService} from "../services/tabela.crescimento.service";


@NgModule({
  declarations: [
    EntradaPeixeComponent,
    TabelaCultivoComponent
    ],
  exports: [],
  imports: [
    CommonModule,
    FormsModule,
    Ng2SearchPipeModule,
    UtilModule,
    CommunsModule,
    NgxMaskModule
  ],
  providers: [
    BsModalService,
    BsModalRef,
    EntradaPeixeService,
    TanqueService,
    PeixeService,
    TabelaCrescimentoService
    ]
})
export class MovimentosModule { }
