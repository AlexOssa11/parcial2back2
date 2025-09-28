package com.example.parcial2.Modelos.DTO;

public class CineDTO {

    private String nombre;
    private String nit;

    public CineDTO() {
    }

    public CineDTO(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
