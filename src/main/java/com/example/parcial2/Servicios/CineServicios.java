package com.example.parcial2.Servicios;

import com.example.parcial2.Modelos.Cine;
import com.example.parcial2.Modelos.DTO.CineDTO;
import com.example.parcial2.Modelos.Mapa.ImapaCine;
import com.example.parcial2.Repositorios.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicios {

    @Autowired
    ICineRepositorio repositorio;

    @Autowired
    ImapaCine mapa;

    public CineDTO guardar(Cine datos)throws Exception{

        try {

            return this.mapa.convertir(
                    this.repositorio.save(datos));
        }catch (Exception error){
            throw new Exception("Error, no te da");
        }
    }
}
