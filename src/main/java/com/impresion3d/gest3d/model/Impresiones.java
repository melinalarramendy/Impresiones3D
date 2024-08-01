package com.impresion3d.gest3d.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Impresiones {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long impresion_id;

    //@ManyToOne
    //@JoinColumn(name = "pieza_id")
    //private Pieza pieza;

    //@ManyToOne
    //@JoinColumn(name = "rollo_id")
    //private Rollos rollo;

    private LocalDateTime fechaImpresion;
    
    private float tiempo;
    
    private float peso;
    
    private float costo_kwh;
    
    private double costo_pieza;
}
