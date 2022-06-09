import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {NgbdSortableHeader} from "./sort/NgbdSortableHeader";
import {AlertModalComponent} from "./alert-model/alert.modal.component";



@NgModule({
  declarations: [
    NgbdSortableHeader,
    AlertModalComponent,

  ],
  exports: [
    NgbdSortableHeader,
    AlertModalComponent,
  ],
  imports: [
    CommonModule,
  ],
})
export class UtilModule { }
