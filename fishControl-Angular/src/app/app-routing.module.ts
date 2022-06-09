import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CadastroUsuarioComponent} from "./cadastro/cadastro-usuario/cadastro.usuario.component";
import {CadastroPeixeComponent} from "./cadastro/cadastro-peixe/cadastro.peixe.component";
import {CadastroTanqueComponent} from "./cadastro/cadastro-tanque/cadastro.tanque.component";
import {CadastroTemperaturaComponent} from "./cadastro/cadastro-temperatura/cadastro.temperatura.component";
import {EntradaPeixeComponent} from "./movimentos/movimentos-entrada-peixe/entrada.peixe.component";
import {TabelaCrescimentoComponent} from "./cadastro/cadastro-tabela-crescimento/tabela.crescimento.component";
import {TabelaCultivoComponent} from "./movimentos/movimentos-tabela-cultivos/tabela.cultivo.component";

const routes: Routes = [
  {path:"cadastro-usuario", component: CadastroUsuarioComponent },
  {path:"cadastro-peixe", component: CadastroPeixeComponent },
  {path:"cadastro-tanque", component: CadastroTanqueComponent },
  {path:"cadastro-temperatura", component: CadastroTemperaturaComponent },
  {path:"tabela-crescimento", component: TabelaCrescimentoComponent },

  {path:"movimentacao-entrada-peixe", component: EntradaPeixeComponent },
  {path:"tabela-cultivo", component: TabelaCultivoComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

