package br.com.getservicos.fishControl.resource;

import br.com.getservicos.fishControl.model.Temperatura;
import br.com.getservicos.fishControl.service.api.TemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaResource {

    @Autowired
    TemperaturaService temperaturaService;

    @GetMapping("/list")
    public ResponseEntity<List<Temperatura>> list() {
        List<Temperatura> entityList = temperaturaService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Temperatura> save(@RequestBody Temperatura entity) throws Exception {
        Temperatura save = temperaturaService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @PutMapping("/edit")
    public ResponseEntity<Temperatura> update(@RequestBody Temperatura entity) {
        Temperatura update = temperaturaService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        temperaturaService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Temperatura> getById(@PathVariable(value = "id") Integer id) {
        Temperatura entity = temperaturaService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
