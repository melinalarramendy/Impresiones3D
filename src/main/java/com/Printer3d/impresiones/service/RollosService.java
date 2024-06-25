package com.Printer3d.impresiones.service;

import com.Printer3d.impresiones.model.Rollos;
import com.Printer3d.impresiones.repository.RollosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RollosService {
    @Autowired
    private RollosRepository rollosRepository;

    public List<Rollos> findAll() {
        return rollosRepository.findAll();
    }

    public Rollos save(Rollos rollos) {
        return rollosRepository.save(rollos);
    }

    public void deleteById(Long material_id) {
        rollosRepository.deleteById(material_id);
    }
}