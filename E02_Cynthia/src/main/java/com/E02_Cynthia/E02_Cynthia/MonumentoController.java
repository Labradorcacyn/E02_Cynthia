package com.E02_Cynthia.E02_Cynthia;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monumento")
@RequiredArgsConstructor
public class MonumentoController {
    private final MonumentoRepository repository;

    @GetMapping("/")
    public List<Monumento> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Monumento findOne(@PathVariable("id") Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(repository.save(monumento));
    }

    @PutMapping("/{id}")
    public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id) {

        Monumento before = repository.findById(id).orElse(monumento);
        before.setCodigo(monumento.getCodigo());
        before.setDescripcion(monumento.getDescripcion());

        return repository.save(before);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
