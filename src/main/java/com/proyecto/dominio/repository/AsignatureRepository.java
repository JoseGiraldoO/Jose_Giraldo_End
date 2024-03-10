package com.proyecto.dominio.repository;

import com.proyecto.dominio.Asignature;
import com.proyecto.dominio.Estudet;

import java.util.List;
import java.util.Optional;

public interface AsignatureRepository {

    Optional<Asignature> getById(int idAsig);
}
