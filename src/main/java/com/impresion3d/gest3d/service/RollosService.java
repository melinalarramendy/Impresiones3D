package com.impresion3d.gest3d.service;

import com.impresion3d.gest3d.model.Rollos;
import com.impresion3d.gest3d.repository.RollosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RollosService extends GenericService <Rollos, Long> {
    @Autowired
    private RollosRepository RollosRepository;
    
    @Override
    public List<Rollos> getAll() {
        return RollosRepository.findAll();
    }

    @Override
    public Rollos getById(Long id) {
        return RollosRepository.findById(id).orElse(null);
    }

    @Override
    public Rollos create(Rollos rollos) {
        return RollosRepository.save(rollos);
    }

    @Override
    public Rollos update(Long id, Rollos rollos ) {
        if (RollosRepository.existsById(id)) {
            return RollosRepository.save(rollos);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        RollosRepository.deleteById(id);
    }
}
