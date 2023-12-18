package com.example.pocmelkinmejia.service.implementation;


import com.example.pocmelkinmejia.entity.Cliente;
import com.example.pocmelkinmejia.entity.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> getProductos();
    Producto save(Producto producto);
}
