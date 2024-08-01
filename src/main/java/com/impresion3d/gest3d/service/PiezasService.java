package com.impresion3d.gest3d.service;

import com.impresion3d.gest3d.model.Piezas;
import com.impresion3d.gest3d.repository.PiezasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PiezasService extends GenericService <Piezas, Long> {
     @Autowired
    private PiezasRepository PiezasRepository;

    @Override
    public List<Piezas> getAll() {
        return PiezasRepository.findAll();
    }

    @Override
    public Piezas getById(Long id) {
        return PiezasRepository.findById(id).orElse(null);
    }

    @Override
    public Piezas create(Piezas pieza) {
        return PiezasRepository.save(pieza);
    }

    @Override
    public Piezas update(Long id, Piezas pieza) {
        if (PiezasRepository.existsById(id)) {
            return PiezasRepository.save(pieza);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        PiezasRepository.deleteById(id);
    }
}
