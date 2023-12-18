package com.example.pocmelkinmejia.service.implementation;

import com.example.pocmelkinmejia.entity.Categoria;
import com.example.pocmelkinmejia.repository.CategoriaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CategoriaService implements ICategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> getCategorias() {
        List<Categoria> lista = new ArrayList<>();
        lista = categoriaRepository.findAll();
        return lista;
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
