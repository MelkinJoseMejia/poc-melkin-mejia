package com.example.pocmelkinmejia.controller;

import com.example.pocmelkinmejia.entity.Categoria;
import com.example.pocmelkinmejia.entity.Cliente;
import com.example.pocmelkinmejia.service.implementation.ICategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    ICategoriaService categoriaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Categoria>> getCategorias(){
        return new ResponseEntity<>(categoriaService.getCategorias(), HttpStatus.OK);
    }

    @PostMapping("/crearCategoria")
    public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
        try {
            Categoria _categoria = categoriaService
                    .save(categoria);
            return new ResponseEntity<>(_categoria, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
