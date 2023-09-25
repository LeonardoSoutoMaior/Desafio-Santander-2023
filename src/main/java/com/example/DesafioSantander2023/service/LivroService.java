package com.example.DesafioSantander2023.service;

import com.example.DesafioSantander2023.domain.model.Livros;

public interface LivroService {

    Livros findById(Long id);

    Livros create(Livros livrosToCreate);
}
