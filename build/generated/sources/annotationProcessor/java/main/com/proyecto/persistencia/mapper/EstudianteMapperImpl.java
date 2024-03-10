package com.proyecto.persistencia.mapper;

import com.proyecto.dominio.Estudet;
import com.proyecto.persistencia.entity.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T19:54:16-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class EstudianteMapperImpl implements EstudianteMapper {

    @Autowired
    private AsignaturaMapper asignaturaMapper;

    @Override
    public Estudet toEstudet(Estudiante estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        Estudet estudet = new Estudet();

        estudet.setIdEstud( estudiante.getIdEstudiante() );
        estudet.setAsignature( asignaturaMapper.toAsignature( estudiante.getAsignatura() ) );
        estudet.setNombre( estudiante.getNombre() );
        estudet.setApellido( estudiante.getApellido() );
        estudet.setCiudad( estudiante.getCiudad() );
        estudet.setFechaDeIngreso( estudiante.getFechaDeIngreso() );
        estudet.setIdAsignatura( estudiante.getIdAsignatura() );

        return estudet;
    }

    @Override
    public List<Estudet> toEstudets(List<Estudiante> estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        List<Estudet> list = new ArrayList<Estudet>( estudiante.size() );
        for ( Estudiante estudiante1 : estudiante ) {
            list.add( toEstudet( estudiante1 ) );
        }

        return list;
    }

    @Override
    public Estudiante toEstudiante(Estudet estudet) {
        if ( estudet == null ) {
            return null;
        }

        Estudiante estudiante = new Estudiante();

        estudiante.setIdEstudiante( estudet.getIdEstud() );
        estudiante.setAsignatura( asignaturaMapper.toAsignatura( estudet.getAsignature() ) );
        estudiante.setNombre( estudet.getNombre() );
        estudiante.setApellido( estudet.getApellido() );
        estudiante.setCiudad( estudet.getCiudad() );
        estudiante.setFechaDeIngreso( estudet.getFechaDeIngreso() );
        estudiante.setIdAsignatura( estudet.getIdAsignatura() );

        return estudiante;
    }
}
