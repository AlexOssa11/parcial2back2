package com.example.parcial2.Repositorios;

import com.example.parcial2.Modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine, Long> {
    Optional<Cine> findByNombre(String nombre);
}