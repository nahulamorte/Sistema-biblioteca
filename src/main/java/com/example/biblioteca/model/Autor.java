package com.example.biblioteca.model;
// ...

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String nacionalidad;

    @Column
    private LocalDate fechaNacimiento;

    @Column (nullable = true)
    private String biografia;

    @OneToMany (mappedBy = "autor")
    @JsonIgnore  // ← AGREGA ESTA LÍNEA
    private List<Libro> libros = new ArrayList<>();
}
