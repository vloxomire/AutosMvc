package com.example.itmasterprofessionaltraining.autosmvc.Models;

public class Auto {
    private String modelo, marca;
    private Integer anio, km;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }
}
