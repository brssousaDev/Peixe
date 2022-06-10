package br.com.getservicos.fishControl.resource.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Pessoa;
import br.com.getservicos.fishControl.service.api.pessoa.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/list")
    public ResponseEntity<List<Pessoa>> list() {
        List<Pessoa> entityList = pessoaService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody Pessoa entity){
        Pessoa save = null;
        try {
            save = pessoaService.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(save);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping("/edit")
    public ResponseEntity<Pessoa> update(@RequestBody Pessoa entity) {
        Pessoa update = pessoaService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        pessoaService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Pessoa> getById(@PathVariable(value = "id") Integer id) {
        Pessoa entity = pessoaService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
