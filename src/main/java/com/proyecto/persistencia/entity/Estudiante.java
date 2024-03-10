package com.proyecto.persistencia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "estudiante")
@JsonIgnoreProperties("asignatur")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idestudiante")
    private Integer idEstudiante;
    private String nombre;
    private String apellido;
    @Column (name = "fechadeingreso")
    private LocalDate fechaDeIngreso;
    @Column (name = "idasignatura")
    private int idAsignatura;
    private String ciudad;
    @ManyToOne()
    @JoinColumn(name = "idasignatura", insertable = false, updatable = false)
    private Asignatura asignatura;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Integer getIdEstudiante() {
        return idEstudiante;
    }
    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }
    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
