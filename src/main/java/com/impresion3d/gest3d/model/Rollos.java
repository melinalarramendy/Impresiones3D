package com.impresion3d.gest3d.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Rollos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollo_id;
    private String color;
    private double peso_gr;
    private double costo;

    //@ManyToOne
    //@JoinColumn(name = "material_id")
    //private Materiales material_id;
}
