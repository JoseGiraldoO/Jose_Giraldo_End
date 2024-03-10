package com.proyecto.dominio.repository;

import com.proyecto.dominio.Estudet;
import com.proyecto.persistencia.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudentRepository {
    List<Estudet> getAll();
    Optional<Estudet> getById(int idEstud);
    Estudet save (Estudet estudet);
    void delete (int idEstud );

    Estudet update (Estudet estudet, int idEstud);

}
