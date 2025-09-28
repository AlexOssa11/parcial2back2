package com.example.parcial2.Modelos.Mapa;

import com.example.parcial2.Modelos.Cine;
import com.example.parcial2.Modelos.DTO.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "Spring")
public interface ImapaCine {

    @Mapping(source = "nombre", target= "nombre")
    @Mapping(source = "nit", target= "nit")
    CineDTO convertir(Cine cine);

}
