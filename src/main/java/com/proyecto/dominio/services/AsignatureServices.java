package com.proyecto.dominio.services;

import com.proyecto.dominio.Asignature;
import com.proyecto.dominio.Estudet;
import com.proyecto.dominio.repository.AsignatureRepository;
import com.proyecto.dominio.repository.EstudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignatureServices {
    @Autowired
    private AsignatureRepository asignatureRepository;
    public Optional<Asignature> getById(int idAsig) {
        return asignatureRepository.getById(idAsig);
    }

}
