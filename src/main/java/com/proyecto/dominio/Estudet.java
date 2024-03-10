package com.proyecto.dominio;

import com.proyecto.persistencia.entity.Asignatura;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Estudet {
    private Integer idEstud;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeIngreso;
    private String ciudad;
    private int idAsignatura;

    private Asignature asignature;
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
    public Integer getIdEstud() {
        return idEstud;
    }
    public void setIdEstud(Integer idEstud) {
        this.idEstud = idEstud;
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

    public Asignature getAsignature() {
        return asignature;
    }

    public void setAsignature(Asignature asignature) {
        this.asignature = asignature;
    }
}
