package com.example.pocmelkinmejia.service.implementation;

import com.example.pocmelkinmejia.entity.Cliente;
import com.example.pocmelkinmejia.entity.Producto;
import com.example.pocmelkinmejia.repository.ClienteRepository;
import com.example.pocmelkinmejia.repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductoService implements IProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> getProductos() {
        List<Producto> lista = new ArrayList<>();
        lista = productoRepository.findAll();
        return lista;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }
}
