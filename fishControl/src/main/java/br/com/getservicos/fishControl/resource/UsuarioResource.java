package br.com.getservicos.fishControl.resource;

import br.com.getservicos.fishControl.model.Usuario;
import br.com.getservicos.fishControl.service.api.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    @Autowired private UsuarioService usuarioService;

    @GetMapping("/list")
    public ResponseEntity<List<Usuario>> list() {
        List<Usuario> entityList = usuarioService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Usuario> save(@RequestBody Usuario entity) throws Exception {
        Usuario save = usuarioService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @PutMapping("/edit")
    public ResponseEntity<Usuario> update(@RequestBody Usuario entity) {
        Usuario update = usuarioService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        usuarioService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable(value = "id") Integer id) {
        Usuario entity = usuarioService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
