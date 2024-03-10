package com.proyecto.persistencia.crud;

import com.proyecto.persistencia.entity.Asignatura;
import org.springframework.data.repository.CrudRepository;

public interface AsignaturaCrudRepository extends CrudRepository<Asignatura, Integer>{
}
