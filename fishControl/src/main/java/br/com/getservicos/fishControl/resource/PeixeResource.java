package br.com.getservicos.fishControl.resource;

import br.com.getservicos.fishControl.model.Peixe;
import br.com.getservicos.fishControl.service.api.PeixeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peixe")
public class PeixeResource {

    @Autowired
    PeixeService peixeService;

    @GetMapping("/list")
    public ResponseEntity<List<Peixe>> list() {
        List<Peixe> entityList = peixeService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Peixe> save(@RequestBody Peixe entity) throws Exception {
        Peixe save = peixeService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @PutMapping("/edit")
    public ResponseEntity<Peixe> update(@RequestBody Peixe entity) {
        Peixe update = peixeService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        peixeService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Peixe> getById(@PathVariable(value = "id") Integer id) {
        Peixe entity = peixeService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
