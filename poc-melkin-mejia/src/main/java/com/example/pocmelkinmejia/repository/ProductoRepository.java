package com.example.pocmelkinmejia.repository;


import com.example.pocmelkinmejia.entity.Cliente;
import com.example.pocmelkinmejia.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findAll();

}
