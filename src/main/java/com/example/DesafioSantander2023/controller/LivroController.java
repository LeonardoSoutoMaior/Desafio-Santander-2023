package com.example.DesafioSantander2023.controller;

import com.example.DesafioSantander2023.domain.model.Livros;
import com.example.DesafioSantander2023.service.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Livros> findById(@PathVariable Long id){

        var livro = livroService.findById(id);
        return ResponseEntity.ok(livro);
    }

    @PostMapping
    public ResponseEntity<Livros> create(@RequestBody Livros livroToCreate){
        var livroCreated = livroService.create(livroToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(livroCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(livroCreated);
    }
}
