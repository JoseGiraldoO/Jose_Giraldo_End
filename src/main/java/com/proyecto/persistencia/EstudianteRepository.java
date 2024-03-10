package com.proyecto.persistencia;

import com.proyecto.dominio.Estudet;
import com.proyecto.dominio.repository.EstudentRepository;
import com.proyecto.persistencia.crud.EstudianteCrudRepository;
import com.proyecto.persistencia.entity.Estudiante;
import com.proyecto.persistencia.mapper.EstudianteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
@Repository
public class EstudianteRepository implements EstudentRepository {
    @Autowired
    private EstudianteCrudRepository estudianteCrudRepository;
    @Autowired
    private EstudianteMapper estudianteMapper;
    @Override
    public List<Estudet> getAll() {
        List<Estudiante> estudentslist = (List<Estudiante>) estudianteCrudRepository.findAll();
        return estudianteMapper.toEstudets(estudentslist);
    }
    @Override
    public Optional<Estudet> getById(int idEstud) {
        return estudianteCrudRepository.findById(idEstud).map(estudiante -> estudianteMapper.toEstudet(estudiante));
    }

    @Override
    public Estudet save(Estudet estudet) {
        Estudiante estudiante = estudianteMapper.toEstudiante(estudet);
        return estudianteMapper.toEstudet(estudianteCrudRepository.save(estudiante));
    }

    @Override
    public void delete(int idEstud) {

        estudianteCrudRepository.deleteById(idEstud);

    }


    @Override
    public Estudet update(Estudet estudet, int idEstud) {

        return estudianteCrudRepository.findById(idEstud).map(estudiante -> {

            estudet.setNombre(estudet.getNombre());
            estudet.setApellido(estudet.getApellido());
            estudet.setCiudad(estudet.getCiudad());
            estudet.setFechaDeIngreso(estudet.getFechaDeIngreso());
            estudet.setIdAsignatura(estudet.getIdAsignatura());
            estudiante = estudianteMapper.toEstudiante(estudet);
            return estudianteMapper.toEstudet(estudianteCrudRepository.save(estudiante));
                }

        ).get();
    }
}
