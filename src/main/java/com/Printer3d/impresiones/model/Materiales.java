package com.Printer3d.impresiones.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Materiales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long material_id;
    private String descripcion;
    private double metros_k;
    private String tipouso;
    private double resistencia;
}