package com.impresion3d.gest3d.controller;

import com.impresion3d.gest3d.model.Rollos;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rollos")
public class RollosController extends GenericController < Rollos, Long > {
    
}
