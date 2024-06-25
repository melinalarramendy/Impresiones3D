package com.Printer3d.impresiones.service;

import com.Printer3d.impresiones.model.Impresiones;
import com.Printer3d.impresiones.repository.ImpresionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpresionesService {
    @Autowired
    private ImpresionesRepository impresionesRepository;

    public List<Impresiones> findAll() {
        return impresionesRepository.findAll();
    }

    public Impresiones save(Impresiones impresiones) {
        return impresionesRepository.save(impresiones);
    }

    public void deleteById(Long impresion_id) {
        impresionesRepository.deleteById(impresion_id);
    }
}