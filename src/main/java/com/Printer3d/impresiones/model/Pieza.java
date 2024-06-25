package com.Printer3d.impresiones.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Pieza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pieza_id;

    @ManyToOne
    @JoinColumn(name = "IDimpresora")
    private Impresoras IDimpresora;

    private String nombre_pieza;
    private int calidad;
    private char archivo_gcode;
}