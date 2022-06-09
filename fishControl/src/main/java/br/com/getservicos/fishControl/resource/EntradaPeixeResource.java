package br.com.getservicos.fishControl.resource;

import br.com.getservicos.fishControl.model.EntradaPeixe;
import br.com.getservicos.fishControl.service.api.EntradaPeixeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrada-peixe")
public class EntradaPeixeResource {

    @Autowired
    EntradaPeixeService entradaPeixeService;

    @GetMapping("/list")
    public ResponseEntity<List<EntradaPeixe>> list() {
        List<EntradaPeixe> entityList = entradaPeixeService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody EntradaPeixe entity){
        EntradaPeixe save = null;
        try {
            save = entradaPeixeService.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(save);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping("/edit")
    public ResponseEntity<EntradaPeixe> update(@RequestBody EntradaPeixe entity) {
        EntradaPeixe update = entradaPeixeService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        entradaPeixeService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<EntradaPeixe> getById(@PathVariable(value = "id") Integer id) {
        EntradaPeixe entity = entradaPeixeService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
