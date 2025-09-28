package com.example.parcial2.Repositorios;

import com.example.parcial2.Modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala, Long> {
    // Consulta personalizada: buscar sala por número
    Optional<Sala> findByNumero(Integer numero);
}
