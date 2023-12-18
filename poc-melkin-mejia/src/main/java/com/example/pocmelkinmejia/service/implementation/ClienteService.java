package com.example.pocmelkinmejia.service.implementation;

import com.example.pocmelkinmejia.entity.Cliente;
import com.example.pocmelkinmejia.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ClienteService implements IClienteService{

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        log.info("En el service de getClientes");
        List<Cliente> lista = new ArrayList<>();
        lista = clienteRepository.findAll();
        log.info("Fin service de getClientes");
        return lista;
    }

    @Override
    public Cliente save(Cliente cliente) {
        log.info("En el service de createCliente");
        return clienteRepository.save(cliente);
    }
}
