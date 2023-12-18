package com.example.pocmelkinmejia.service.implementation;


import com.example.pocmelkinmejia.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> getClientes();
    Cliente save(Cliente cliente);
}
