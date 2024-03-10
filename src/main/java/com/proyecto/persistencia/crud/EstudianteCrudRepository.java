package com.proyecto.persistencia.crud;

import com.proyecto.persistencia.entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteCrudRepository extends CrudRepository<Estudiante, Integer> {
}
