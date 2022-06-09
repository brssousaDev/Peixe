package br.com.getservicos.fishControl.resource;

import br.com.getservicos.fishControl.model.TabelaCultivo;
import br.com.getservicos.fishControl.model.Tanque;
import br.com.getservicos.fishControl.service.api.TabelaCultivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tabela-cultivo")
public class TabelaCultivoResource {

    @Autowired
    TabelaCultivoService tabelaCultivoService;

    @GetMapping("/list")
    public ResponseEntity<List<TabelaCultivo>> list() {
        List<TabelaCultivo> entityList = tabelaCultivoService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<TabelaCultivo> save(@RequestBody TabelaCultivo entity) throws Exception {
        TabelaCultivo save = tabelaCultivoService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @PutMapping("/edit")
    public ResponseEntity<TabelaCultivo> update(@RequestBody TabelaCultivo entity) {
        TabelaCultivo update = tabelaCultivoService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        tabelaCultivoService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<TabelaCultivo> getById(@PathVariable(value = "id") Integer id) {
        TabelaCultivo entity = tabelaCultivoService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/tanque/{id}")
    public ResponseEntity getByTanque(@PathVariable(value = "id") Integer id) {
        Tanque tanque = new Tanque();
        tanque.setId(id);
        TabelaCultivo entity = tabelaCultivoService.getByTanque(tanque);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
