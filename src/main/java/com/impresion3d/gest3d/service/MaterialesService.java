package com.impresion3d.gest3d.service;

import com.impresion3d.gest3d.model.Materiales;
import com.impresion3d.gest3d.repository.MaterialesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialesService extends GenericService <Materiales, Long>{
    @Autowired
    private MaterialesRepository materialesRepository;

    @Override
    public List<Materiales> getAll() {
        return materialesRepository.findAll();
    }

    @Override
    public Materiales getById(Long id) {
        return materialesRepository.findById(id).orElse(null);
    }

    @Override
    public Materiales create(Materiales materiales) {
        return materialesRepository.save(materiales);
    }

    @Override
    public Materiales update(Long id, Materiales materiales) {
        if (materialesRepository.existsById(id)) {
            return materialesRepository.save(materiales);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        materialesRepository.deleteById(id);
    }
}
