import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {UsuarioService} from "../services/usuario.service";
import {CadastroUsuarioComponent} from "./cadastro-usuario/cadastro.usuario.component";
import {FormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {CommunsModule} from "../communs/communs.module";
import {UtilModule} from "../util/util.module";
import {BsModalRef, BsModalService} from "ngx-bootstrap/modal";
import {CadastroTanqueComponent} from "./cadastro-tanque/cadastro.tanque.component";
import {TanqueService} from "../services/tanque.service";
import {PeixeService} from "../services/peixe.service";
import {CadastroPeixeComponent} from "./cadastro-peixe/cadastro.peixe.component";
import {CadastroTemperaturaComponent} from "./cadastro-temperatura/cadastro.temperatura.component";
import {TemperaturaService} from "../services/temperatura.service";
import {TabelaCrescimentoService} from "../services/tabela.crescimento.service";
import {TabelaCrescimentoComponent} from "./cadastro-tabela-crescimento/tabela.crescimento.component";
import {NgxMaskModule} from "ngx-mask";
import {ClienteService} from "../services/pessoa/cliente.service";
import {CadastroClienteComponent} from "./cadastro-cliente/cadastro.cliente.component";


@NgModule({
  declarations: [
    CadastroUsuarioComponent,
    CadastroTanqueComponent,
    CadastroPeixeComponent,
    CadastroTemperaturaComponent,
    TabelaCrescimentoComponent,
    CadastroClienteComponent
    ],
  exports: [],
  imports: [
    CommonModule,
    FormsModule,
    Ng2SearchPipeModule,
    UtilModule,
    CommunsModule,
    NgxMaskModule,
  ],
  providers: [
    UsuarioService,
    BsModalService,
    BsModalRef,
    TanqueService,
    PeixeService,
    TemperaturaService,
    ClienteService,
    TabelaCrescimentoService,]
})
export class CadastroModule { }
