package br.com.getservicos.fishControl.resource.pessoa;

import br.com.getservicos.fishControl.model.pessoa.Cliente;
import br.com.getservicos.fishControl.service.api.pessoa.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/list")
    public ResponseEntity<List<Cliente>> list() {
        List<Cliente> entityList = clienteService.findAll();
        if(entityList!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entityList);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody Cliente entity){
        Cliente save = null;
        try {
            save = clienteService.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(save);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

    @PutMapping("/edit")
    public ResponseEntity<Cliente> update(@RequestBody Cliente entity) {
        Cliente update = clienteService.update(entity);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        clienteService.delete(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable(value = "id") Integer id) {
        Cliente entity = clienteService.findById(id);
        if(entity!=null) {
            return ResponseEntity.status(HttpStatus.OK).body(entity);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
