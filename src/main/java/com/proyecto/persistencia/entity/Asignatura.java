package com.proyecto.persistencia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "asignatura")
@JsonIgnoreProperties("estudiantes")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idasignatura")
    private Integer idAsignatura;
    private String inscribir;
    @OneToMany(mappedBy = "asignatura")
    private List<Estudiante> estudiantes;

    public Integer getIdAsignatura() {
        return idAsignatura;
    }
    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }
    public String getInscribir() {
        return inscribir;
    }
    public void setInscribir(String inscribir) {
        this.inscribir = inscribir;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}

