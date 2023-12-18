package com.example.pocmelkinmejia.controller;

import com.example.pocmelkinmejia.entity.Producto;
import com.example.pocmelkinmejia.service.implementation.IProductoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    IProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> getProductos(){
        return new ResponseEntity<>(productoService.getProductos(), HttpStatus.OK);
    }

    @PostMapping("/crearProducto")
    public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
        try {
            Producto _producto = productoService
                    .save(producto);
            return new ResponseEntity<>(_producto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
