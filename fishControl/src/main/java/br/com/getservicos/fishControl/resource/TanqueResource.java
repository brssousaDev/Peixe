package br.com.getservicos.fishControl.resource;

import br.com.getservicos.fishControl.model.Tanque;
import br.com.getservicos.fishControl.service.api.TanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tanque")
public class TanqueResource {

    @Autowired
    TanqueService tanqueService;

    @GetMapping("/list")
    public ResponseEntity<List<Tanque>> list() {
        List<Tanque> entityList = tanqueService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Tanque> save(@RequestBody Tanque entity) throws Exception {
        Tanque save = tanqueService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @PutMapping("/edit")
    public ResponseEntity<Tanque> update(@RequestBody Tanque entity) {
        Tanque update = tanqueService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        tanqueService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Tanque> getById(@PathVariable(value = "id") Integer id) {
        Tanque entity = tanqueService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
