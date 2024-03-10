package com.proyecto.persistencia;

import com.proyecto.dominio.Asignature;
import com.proyecto.dominio.Estudet;
import com.proyecto.dominio.repository.AsignatureRepository;
import com.proyecto.persistencia.crud.AsignaturaCrudRepository;
import com.proyecto.persistencia.mapper.AsignaturaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AsignaturaRepository implements AsignatureRepository {
    @Autowired
    private AsignaturaCrudRepository asignaturaCrudRepository;
    private AsignaturaMapper asignaturaMapper;

    @Override
    public Optional<Asignature> getById(int idAsig) {
        return asignaturaCrudRepository.findById(idAsig).map(asignatura -> asignaturaMapper.toAsignature(asignatura));
    }
}
