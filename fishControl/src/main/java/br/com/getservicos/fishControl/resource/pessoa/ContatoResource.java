package br.com.getservicos.fishControl.resource.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Contato;
import br.com.getservicos.fishControl.service.api.pessoa.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoResource {

    @Autowired
    private ContatoService contatoService;

    @GetMapping("/list")
    public ResponseEntity<List<Contato>> list() {
        List<Contato> entityList = contatoService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody Contato entity){
        Contato save = null;
        try {
            save = contatoService.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(save);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping("/edit")
    public ResponseEntity<Contato> update(@RequestBody Contato entity) {
        Contato update = contatoService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        contatoService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Contato> getById(@PathVariable(value = "id") Integer id) {
        Contato entity = contatoService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
