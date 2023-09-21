package com.example.DesafioSantander2023.repository;

import com.example.DesafioSantander2023.domain.model.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<Livros, Long> {

}
