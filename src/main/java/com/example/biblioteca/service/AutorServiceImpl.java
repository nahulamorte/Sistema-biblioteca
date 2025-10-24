package com.example.biblioteca.service;

import com.example.biblioteca.model.Autor;
import com.example.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl implements AutorService {

    @Autowired
    private final AutorRepository autorRepository;

    public AutorServiceImpl(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    @Override
    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    @Override
    public Autor findByid(Long id) {
        return autorRepository.getById(id);
    }

    @Override
    public void addAutor(Autor nuevoAutor) {
        autorRepository.save(nuevoAutor);
    }

    @Override
    public Autor actualizarAutor(Long id, Autor autorAct) {
        return autorRepository.save(autorAct);
    }

    @Override
    public void eliminarAutorPorId(Long id) {
        autorRepository.deleteById(id);
    }

    @Override
    public void eliminarTodo() {
        autorRepository.deleteAll();
    }
}
