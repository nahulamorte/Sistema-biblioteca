package com.example.biblioteca.service;

import com.example.biblioteca.model.Autor;

import java.util.List;

public interface AutorService {

    //GET
    List<Autor> findAll();


    //GETxID
    Autor findByid(Long id);

    //POST
    void addAutor(Autor nuevoAutor);

    //UPDATE
    Autor actualizarAutor(Long id, Autor autorAct);

    //DELETE
    void eliminarTodo();

    //DELETExID
    void eliminarAutorPorId(Long id);


}
