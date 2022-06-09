package br.com.getservicos.fishControl.resource;

import br.com.getservicos.fishControl.model.TabelaCrescimento;
import br.com.getservicos.fishControl.service.api.TabelaCrescimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tabela-crescimento")
public class TabelaCrescimentoResource {

    @Autowired
    TabelaCrescimentoService tabelaCrescimentoService;

    @GetMapping("/list")
    public ResponseEntity<List<TabelaCrescimento>> list() {
        List<TabelaCrescimento> entityList = tabelaCrescimentoService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*@PostMapping("/create")
    public ResponseEntity<TabelaCrescimento> save(@RequestBody TabelaCrescimento entity) {
        TabelaCrescimento save = tabelaCrescimentoService.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }

    @PostMapping("/saveList")
    public ResponseEntity<TabelaCrescimento> saveList(@RequestBody List<TabelaCrescimento> list) {
        tabelaCrescimentoService.salvarLista(list);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/edit")
    public ResponseEntity<TabelaCrescimento> update(@RequestBody TabelaCrescimento entity) {
        TabelaCrescimento update = tabelaCrescimentoService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        tabelaCrescimentoService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<TabelaCrescimento> getById(@PathVariable(value = "id") Integer id) {
        Optional<TabelaCrescimento> entity = tabelaCrescimentoService.findById(id);
        if(entity.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(entity.get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/
}
