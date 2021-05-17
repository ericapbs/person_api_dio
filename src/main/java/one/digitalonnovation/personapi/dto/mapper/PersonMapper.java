package one.digitalinnovation.personapi.dto.mapper;

import one.digitalonnovation.personapi.dto.request.PersonDTO;
import one.digitalonnovation.personapi.entity.Person;
import one.digitalonnovation.personapi.dto.mapper.Mapper;
import one.digitalonnovation.personapi.dto.mapper.Mapping;
import one.digitalonnovation.personapi.dto.request.PersonDTO;
import one.digitalonnovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
