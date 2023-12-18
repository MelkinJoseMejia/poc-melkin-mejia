package com.example.pocmelkinmejia.service.implementation;


import com.example.pocmelkinmejia.entity.Compra;

import java.util.List;

public interface ICompraService {
    List<Compra> getCompras();
    Compra save(Compra compra);
}
