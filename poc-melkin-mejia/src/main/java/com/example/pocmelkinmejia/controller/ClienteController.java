package com.example.pocmelkinmejia.controller;

import com.example.pocmelkinmejia.entity.Cliente;
import com.example.pocmelkinmejia.service.implementation.IClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    IClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> getClientes(){
        log.info("Inicia consumo getClientes");
        return new ResponseEntity<>(clienteService.getClientes(), HttpStatus.OK);
    }

    @PostMapping("/crearCliente")
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        log.info("Inicia consumo createCliente");
        try {
            Cliente _cliente = clienteService
                    .save(cliente);
            log.info("Fin consumo createCliente");
            return new ResponseEntity<>(_cliente, HttpStatus.CREATED);
        } catch (Exception e) {
            log.info("Excepcion consumo createCliente");
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
