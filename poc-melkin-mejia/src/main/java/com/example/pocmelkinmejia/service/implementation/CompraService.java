package com.example.pocmelkinmejia.service.implementation;

import com.example.pocmelkinmejia.entity.Compra;
import com.example.pocmelkinmejia.repository.CompraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CompraService implements ICompraService{

    @Autowired
    CompraRepository compraRepository;

    @Override
    public List<Compra> getCompras() {
        List<Compra> lista = new ArrayList<>();
        lista = compraRepository.findAll();
        return lista;
    }

    @Override
    public Compra save(Compra producto) {
        return compraRepository.save(producto);
    }
}
