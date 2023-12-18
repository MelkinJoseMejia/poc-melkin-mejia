package com.example.pocmelkinmejia.controller;

import com.example.pocmelkinmejia.entity.Compra;
import com.example.pocmelkinmejia.service.implementation.ICompraService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    ICompraService compraService;

    @GetMapping("/listar")
    public ResponseEntity<List<Compra>> getProductos(){
        return new ResponseEntity<>(compraService.getCompras(), HttpStatus.OK);
    }

    @PostMapping("/crearCompra")
    public ResponseEntity<Compra> createProducto(@RequestBody Compra producto) {
        try {
            Compra _producto = compraService
                    .save(producto);
            return new ResponseEntity<>(_producto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
