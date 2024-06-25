package com.Printer3d.impresiones.service;

import com.Printer3d.impresiones.model.Materiales;
import com.Printer3d.impresiones.repository.MaterialesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialesService {
    @Autowired
    private MaterialesRepository materialesRepository;

    public List<Materiales> findAll() {
        return materialesRepository.findAll();
    }

    public Materiales save(Materiales materiales) {
        return materialesRepository.save(materiales);
    }

    public void deleteById(Long rollo_id) {
        materialesRepository.deleteById(rollo_id);
    }
}