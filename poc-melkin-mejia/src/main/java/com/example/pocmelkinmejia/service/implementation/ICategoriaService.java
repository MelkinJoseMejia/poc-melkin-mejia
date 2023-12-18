package com.example.pocmelkinmejia.service.implementation;


import com.example.pocmelkinmejia.entity.Categoria;

import java.util.List;

public interface ICategoriaService {
    List<Categoria> getCategorias();
    Categoria save(Categoria categoria);
}
