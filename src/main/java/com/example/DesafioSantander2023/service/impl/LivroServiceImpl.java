package com.example.DesafioSantander2023.service.impl;

import com.example.DesafioSantander2023.domain.model.Livros;
import com.example.DesafioSantander2023.repository.LivroRepository;
import com.example.DesafioSantander2023.service.LivroService;

public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }


    @Override
    public Livros findById(Long id) {
        return livroRepository.findById(id).orElseThrow(NoSuchFieldError::new);
    }

    @Override
    public Livros create(Livros livrosToCreate) {

        if(livroRepository.existsByLivrosTitulo(livrosToCreate.getTitulo())){
            throw new IllegalArgumentException("Esse livro já existe!");
        }

        return livroRepository.save((livrosToCreate));
    }
}
