package com.proyecto.dominio;

import com.proyecto.persistencia.entity.Estudiante;

public class Asignature {
    private Integer idAsig;
    private String insc;
    public String getInsc() {
        return insc;
    }
    public void setInsc(String insc) {
        this.insc = insc;
    }
    public Integer getIdAsig() {
        return idAsig;
    }
    public void setIdAsig(Integer idAsig) {
        this.idAsig = idAsig;
    }


}
