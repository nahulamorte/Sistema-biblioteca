package com.example.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Categoria {
    @Id
    private Long id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    //Lista de libros.
    @OneToMany (mappedBy = "categoria")
    @JsonIgnore
    private List<Libro> libros = new ArrayList<>();


}
