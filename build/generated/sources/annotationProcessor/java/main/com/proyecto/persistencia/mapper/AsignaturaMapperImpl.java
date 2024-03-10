package com.proyecto.persistencia.mapper;

import com.proyecto.dominio.Asignature;
import com.proyecto.persistencia.entity.Asignatura;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T19:54:16-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class AsignaturaMapperImpl implements AsignaturaMapper {

    @Override
    public Asignature toAsignature(Asignatura asignatura) {
        if ( asignatura == null ) {
            return null;
        }

        Asignature asignature = new Asignature();

        asignature.setIdAsig( asignatura.getIdAsignatura() );
        asignature.setInsc( asignatura.getInscribir() );

        return asignature;
    }

    @Override
    public List<Asignature> toAsignatures(List<Asignatura> asignatura) {
        if ( asignatura == null ) {
            return null;
        }

        List<Asignature> list = new ArrayList<Asignature>( asignatura.size() );
        for ( Asignatura asignatura1 : asignatura ) {
            list.add( toAsignature( asignatura1 ) );
        }

        return list;
    }

    @Override
    public Asignatura toAsignatura(Asignature asignature) {
        if ( asignature == null ) {
            return null;
        }

        Asignatura asignatura = new Asignatura();

        asignatura.setIdAsignatura( asignature.getIdAsig() );
        asignatura.setInscribir( asignature.getInsc() );

        return asignatura;
    }
}
