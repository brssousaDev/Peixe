import {Component} from "@angular/core";
import {Usuario} from "../../model/usuario";
import {UsuarioService} from "../../services/usuario.service";
import {BaseCrudComponent} from "../../core/base.crud.component";
import {AlertModelService} from "../../services/alert.model.service";

@Component({
  selector: 'usuario',
  templateUrl: './cadastro.usuario.component.html',
  styleUrls: ['./cadastro.usuario.component.css']
})
export class CadastroUsuarioComponent extends BaseCrudComponent<Usuario> {


  constructor(public mainService: UsuarioService,
              public alertService: AlertModelService) {
    super(mainService,alertService)
  }

  ngOnInit() {
    this.filter = new Usuario();
  }

  clean() {
    this.filter = new Usuario();
    super.clean();
  }
}
