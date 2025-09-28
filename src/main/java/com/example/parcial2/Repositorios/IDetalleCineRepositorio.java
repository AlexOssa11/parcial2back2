package com.example.parcial2.Repositorios;

import com.example.parcial2.Modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine, Long> {
    // Consulta personalizada: buscar detalle por ciudad
    Optional<DetalleCine> findByCiudad(String ciudad);
}