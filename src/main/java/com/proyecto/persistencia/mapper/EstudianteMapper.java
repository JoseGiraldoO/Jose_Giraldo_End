package com.proyecto.persistencia.mapper;
import com.proyecto.dominio.Estudet;
import com.proyecto.persistencia.entity.Estudiante;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
@Mapper(componentModel = "spring", uses = {AsignaturaMapper.class})
public interface EstudianteMapper {
    @Mappings({
            @Mapping(source = "idEstudiante", target = "idEstud"),
            @Mapping(source = "asignatura", target = "asignature")
    })
    Estudet toEstudet(Estudiante estudiante);
    List<Estudet> toEstudets(List<Estudiante> estudiante);
    @InheritInverseConfiguration
    Estudiante toEstudiante(Estudet estudet);
}
