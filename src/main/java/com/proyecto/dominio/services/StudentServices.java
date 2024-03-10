package com.proyecto.dominio.services;
import com.proyecto.dominio.Estudet;
import com.proyecto.dominio.repository.EstudentRepository;
import com.proyecto.persistencia.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServices {
    @Autowired
    private EstudentRepository estudentRepository;
    public List<Estudet> getAll() {
        return estudentRepository.getAll();

    }
    public Optional<Estudet> getById(int idEstud) {
        return estudentRepository.getById(idEstud);
    }
    public Estudet save(Estudet estudet) {

        return estudentRepository.save(estudet);
    }

    public boolean delete(int idEstud) {

        if (estudentRepository.getById(idEstud).isPresent()){
            estudentRepository.delete(idEstud);
            return true;
        }else
            return false;
    }
    public Estudet update (Estudet estudet, int idEstud){

        return estudentRepository.update(estudet,idEstud);
    }

}
