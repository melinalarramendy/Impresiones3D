package com.Printer3d.impresiones.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Impresiones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long impresion_id;

    @ManyToOne
    @JoinColumn(name = "pieza_id")
    private Pieza pieza_id;

    @ManyToOne
    @JoinColumn(name = "rollo_id")
    private Rollos rollo_id;

    private LocalDateTime fechaImpresion;
    private float tiempo;
    private float peso;
    private float costo_kwh;
    private double costo_pieza;
}