package com.example.DesafioSantander2023.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "avaliacao")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String textoAvaliacao;


    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTextoAvaliacao() {
        return textoAvaliacao;
    }

    public void setTextoAvaliacao(String textoAvaliacao) {
        this.textoAvaliacao = textoAvaliacao;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
}
