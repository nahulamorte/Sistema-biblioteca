package com.example.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter @Setter
public class Prestamo {
    @Id
    private Long id;

    @Column
    private LocalDate fechaPrestamo;

    @Column
    private LocalDate fechaDevEsperada;

    @Column
    private LocalDate fechaDevReal;

    @Column
    @Enumerated(EnumType.STRING)  // ← Guarda como texto, no número
    private EstadoPrestamo estadoPrestamo;

    @ManyToOne
    @JoinColumn (name = "libro_id", referencedColumnName = "id")
    private Libro libro;

    @ManyToOne
    @JoinColumn (name = "usuario_id", referencedColumnName = "id")
    @JsonIgnore
    private Usuario usuario;


}
