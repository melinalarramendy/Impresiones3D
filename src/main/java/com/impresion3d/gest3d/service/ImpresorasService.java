package com.impresion3d.gest3d.service;

import com.impresion3d.gest3d.repository.ImpresorasRepository;
import com.impresion3d.gest3d.model.Impresoras;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpresorasService extends GenericService <Impresoras, Long> {
    @Autowired
    private ImpresorasRepository impresorasRepository;

    @Override
    public List<Impresoras> getAll() {
        return impresorasRepository.findAll();
    }

    @Override
    public Impresoras getById(Long id) {
        return impresorasRepository.findById(id).orElse(null);
    }

    @Override
    public Impresoras create(Impresoras impresoras) {
        return impresorasRepository.save(impresoras);
    }

    @Override
    public Impresoras update(Long id, Impresoras impresoras) {
        if (impresorasRepository.existsById(id)) {
            return impresorasRepository.save(impresoras);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        impresorasRepository.deleteById(id);
    }
}
