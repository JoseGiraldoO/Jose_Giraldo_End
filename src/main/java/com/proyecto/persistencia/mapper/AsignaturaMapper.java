package com.proyecto.persistencia.mapper;
import com.proyecto.dominio.Asignature;
import com.proyecto.persistencia.entity.Asignatura;
import com.proyecto.persistencia.entity.Estudiante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
@Mapper(componentModel = "spring")
public interface AsignaturaMapper {
    @Mappings({
            @Mapping(source = "idAsignatura", target = "idAsig"),
            @Mapping(source = "inscribir", target = "insc")
    })
    Asignature toAsignature(Asignatura asignatura);
    List<Asignature> toAsignatures(List<Asignatura> asignatura);
    @InheritInverseConfiguration
    @Mapping(target = "estudiantes", ignore = true)
    Asignatura toAsignatura(Asignature asignature);
}
