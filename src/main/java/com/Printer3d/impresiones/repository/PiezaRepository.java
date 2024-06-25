package com.Printer3d.impresiones.repository;

import com.Printer3d.impresiones.model.Pieza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiezaRepository extends JpaRepository<Pieza, Long> {
}