import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from "@angular/forms";

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {CommunsModule} from "./communs/communs.module";
import {CadastroModule} from "./cadastro/cadastro.module";
import {HttpClientModule} from "@angular/common/http";
import {ModalModule} from 'ngx-bootstrap/modal';
import {MovimentosModule} from "./movimentos/movimentos.module";
import {NgxMaskModule} from "ngx-mask";


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommunsModule,
    CadastroModule,
    MovimentosModule,
    HttpClientModule,
    FormsModule,
    ModalModule.forRoot(),
    NgxMaskModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
