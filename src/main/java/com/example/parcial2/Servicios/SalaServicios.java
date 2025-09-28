package com.example.parcial2.Servicios;

import com.example.parcial2.Modelos.Sala;
import com.example.parcial2.Repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalaServicios {

    @Autowired
    private ISalaRepositorio repositorio;

    @Transactional
    public Sala guardar(Sala sala) throws Exception {
        try {
            // Al igual que DetalleCine, Sala tiene ManyToOne hacia Cine con nullable = false
            if (sala.getCine() == null) {
                throw new Exception("La sala debe estar asociada a un cine existente (cine != null).");
            }
            return repositorio.save(sala);
        } catch (Exception e) {
            throw new Exception("Error guardando sala: " + e.getMessage(), e);
        }
    }
}
