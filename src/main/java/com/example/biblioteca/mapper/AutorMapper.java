package com.example.biblioteca.mapper;

import com.example.biblioteca.dto.AutorDTO;
import com.example.biblioteca.model.Autor;

public class AutorMapper {

    public static AutorDTO convertirA_DTO(Autor autor){
        AutorDTO autorDTO = new AutorDTO();
        autorDTO.setId(autor.getId());
        autorDTO.setNombre(autor.getNombre());
        autorDTO.setApellido(autor.getApellido());
        autorDTO.setNacionalidad(autor.getNacionalidad());
        autorDTO.setFechaNacimiento(autor.getFechaNacimiento());
        return autorDTO;
    }
}
