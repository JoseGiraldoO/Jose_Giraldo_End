package com.proyecto.web;

import com.proyecto.dominio.Asignature;
import com.proyecto.dominio.services.AsignatureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asignature")
public class AsignatureController {

    @Autowired
    private AsignatureServices asignatureServices;

    @GetMapping("{idAsig}")
    public ResponseEntity<Asignature> getById(@PathVariable int idAsig){

        return asignatureServices.getById(idAsig).map(asignature -> new ResponseEntity<>(asignature, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
