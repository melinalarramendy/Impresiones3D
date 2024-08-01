package com.impresion3d.gest3d.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Impresoras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDimpresora;
    private String nom_impresora;

    //@ManyToOne
    //@JoinColumn(name = "pieza_id")
    //private Pieza pieza_id;

    private String marca;
    private String modelo;
    private float alto_imp;
    private float ancho_imp;
    private float largo_imp;
    private double consumo_hora;
    private double horas_uso;
    private int ultimo_mantenimiento;
}
