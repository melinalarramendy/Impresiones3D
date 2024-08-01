package com.impresion3d.gest3d.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Piezas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pieza_id;

    //@ManyToOne
    //@JoinColumn(name = "IDimpresora")
    //private Impresoras IDimpresora;

    private String nombre_pieza;
    private int calidad;
    private char archivo_gcode;
}
