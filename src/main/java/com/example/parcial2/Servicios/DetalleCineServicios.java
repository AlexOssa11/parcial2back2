package com.example.parcial2.Servicios;

import com.example.parcial2.Modelos.DetalleCine;
import com.example.parcial2.Repositorios.IDetalleCineRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DetalleCineServicios {

    private final IDetalleCineRepositorio repositorio;

    // Inyección por constructor (recomendada)
    public DetalleCineServicios(IDetalleCineRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Transactional
    public DetalleCine guardar(DetalleCine detalle) throws Exception {
        if (detalle == null) {
            throw new Exception("Detalle nulo recibido.");
        }
        if (detalle.getCine() == null) {
            throw new Exception("El detalle debe estar asociado a un cine existente (cine != null).");
        }
        try {
            return repositorio.save(detalle);
        } catch (Exception e) {
            throw new Exception("Error guardando detalle de cine: " + e.getMessage(), e);
        }
    }
}
