package com.Printer3d.impresiones.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Rollos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollo_id;
    private String color;
    private double peso_gr;
    private double costo;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Materiales material_id;
}