package com.Printer3d.impresiones.repository;

import com.Printer3d.impresiones.model.Impresiones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImpresionesRepository extends JpaRepository<Impresiones, Long> {
}