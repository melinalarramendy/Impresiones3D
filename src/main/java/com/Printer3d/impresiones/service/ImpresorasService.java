package com.Printer3d.impresiones.service;

import com.Printer3d.impresiones.model.Impresoras;
import com.Printer3d.impresiones.repository.ImpresorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpresorasService {
    @Autowired
    private ImpresorasRepository impresorasRepository;

    public List<Impresoras> findAll() {
        return impresorasRepository.findAll();
    }

    public Impresoras save(Impresoras pieza) {
        return impresorasRepository.save(pieza);
    }

    public void deleteById(Long IDimpresora) {
        impresorasRepository.deleteById(IDimpresora);
    }
}