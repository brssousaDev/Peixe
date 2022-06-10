package br.com.getservicos.fishControl.resource.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Responsavel;
import br.com.getservicos.fishControl.service.api.pessoa.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responsavel")
public class ResponsavelResource {

    @Autowired
    private ResponsavelService responsavelService;

    @GetMapping("/list")
    public ResponseEntity<List<Responsavel>> list() {
        List<Responsavel> entityList = responsavelService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody Responsavel entity){
        Responsavel save = null;
        try {
            save = responsavelService.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(save);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping("/edit")
    public ResponseEntity<Responsavel> update(@RequestBody Responsavel entity) {
        Responsavel update = responsavelService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        responsavelService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Responsavel> getById(@PathVariable(value = "id") Integer id) {
        Responsavel entity = responsavelService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
