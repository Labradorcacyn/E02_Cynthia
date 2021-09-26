package com.E02_Cynthia.E02_Cynthia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Monumento {
    @Id
    @GeneratedValue
    private Long id;

    private String codigo;
    private String nombrePais;
    private String nombreCiudad;
    private String localizacion;
    private String nombreMonumento;
    private String descripcion;
    private String urlImg;

    public Monumento(String codigo, String nombrePais, String nombreCiudad, String localizacion, String nombreMonumento, String descripcion, String urlImg) {
        this.codigo = codigo;
        this.nombrePais = nombrePais;
        this.nombreCiudad = nombreCiudad;
        this.localizacion = localizacion;
        this.nombreMonumento = nombreMonumento;
        this.descripcion = descripcion;
        this.urlImg = urlImg;
    }
}
