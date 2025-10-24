package com.example.biblioteca.controller;

import com.example.biblioteca.model.Autor;
import com.example.biblioteca.service.AutorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/autores")  // ← Cambié a "autores" (plural)
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {  // ← Quité ServerProperties
        this.autorService = autorService;
    }

    // GET /api/autores
    @GetMapping
    public List<Autor> findAll(){
        return autorService.findAll();
    }

    // GET /api/autores/1
    @GetMapping("/{id}")
    public Autor getAutorById(@PathVariable Long id){  // ← Agregué @PathVariable
        return autorService.findByid(id);
    }

    // POST /api/autores
    @PostMapping
    public void addAutor(@RequestBody Autor autor){  // ← Agregué @RequestBody y return
        autorService.addAutor(autor);
    }

    // PUT /api/autores/1
    @PutMapping("/{id}")
    public Autor actualizarAutor(@PathVariable Long id, @RequestBody Autor autor){  // ← Agregué anotaciones
        return autorService.actualizarAutor(id, autor);
    }

    // DELETE /api/autores/1
    @DeleteMapping("/{id}")
    public void deleteAutorById(@PathVariable Long id){  // ← Agregué @PathVariable
        autorService.eliminarAutorPorId(id);
    }

    @DeleteMapping
    public void deleteAll(){
        autorService.eliminarTodo();
    }
}