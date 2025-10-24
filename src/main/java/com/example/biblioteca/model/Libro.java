package com.example.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Libro {

    @Id
    private Long id;

    @Column
    private String nombre;

    @Column
    private String isbn;

    @Column
    private int anioPublicacion;

    @Column
    private int numeroPaginas;

    @Column
    private String sinopsis;

    //Relacion con autor -> Autor autor; //Hecha del lado de autor.

    //Relacion con categoria -> Categoria cat
    @ManyToOne
    @JoinColumn (name = "nombre_categoria", referencedColumnName = "nombre")
    @JsonIgnore
    private Categoria categoria;

    @ManyToOne
    @JoinColumn (name = "autor_id", referencedColumnName = "id")
    @JsonIgnore
    private Autor autor;



}
