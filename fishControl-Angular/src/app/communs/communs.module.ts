import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {NavbarComponent} from "./navbar/navbar.component";
import {SideBarComponent} from "./sidebar/sidebar.component";
import {AppRoutingModule} from "../app-routing.module";
import {HeaderComponent} from "./header/header.component";



@NgModule({
  declarations: [
    NavbarComponent,
    SideBarComponent,
    HeaderComponent,
  ],
  exports: [
    NavbarComponent,
    SideBarComponent,
    HeaderComponent,
  ],
  imports: [
    CommonModule,
    AppRoutingModule,
  ]
})
export class CommunsModule { }
