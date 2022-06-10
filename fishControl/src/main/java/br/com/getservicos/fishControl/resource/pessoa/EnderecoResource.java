package br.com.getservicos.fishControl.resource.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Endereco;
import br.com.getservicos.fishControl.service.api.pessoa.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/list")
    public ResponseEntity<List<Endereco>> list() {
        List<Endereco> entityList = enderecoService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody Endereco entity){
        Endereco save = null;
        try {
            save = enderecoService.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(save);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping("/edit")
    public ResponseEntity<Endereco> update(@RequestBody Endereco entity) {
        Endereco update = enderecoService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        enderecoService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Endereco> getById(@PathVariable(value = "id") Integer id) {
        Endereco entity = enderecoService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
