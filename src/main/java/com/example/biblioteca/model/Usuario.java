package com.example.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Usuario {

    @Id
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String email;

    @Column
    private String telefono;

    @Column
    private LocalDate fechaRegistro;

    @Column
    private boolean activo;

    //Lista de prestamos.
    @OneToMany (mappedBy = "usuario")
    @JsonIgnore
    private List<Prestamo> prestamos = new ArrayList<>();
}
