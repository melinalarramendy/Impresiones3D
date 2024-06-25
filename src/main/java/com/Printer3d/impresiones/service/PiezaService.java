package com.Printer3d.impresiones.service;

import com.Printer3d.impresiones.model.Pieza;
import com.Printer3d.impresiones.repository.PiezaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiezaService {
    @Autowired
    private PiezaRepository piezaRepository;

    public List<Pieza> findAll() {
        return piezaRepository.findAll();
    }

    public Pieza save(Pieza pieza) {
        return piezaRepository.save(pieza);
    }

    public void deleteById(Long pieza_id) {
        piezaRepository.deleteById(pieza_id);
    }
}