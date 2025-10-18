package br.com.kadoozin.reservas.project.mappers;

import br.com.kadoozin.reservas.project.dtos.in.EnderecosRequestDTO;
import br.com.kadoozin.reservas.project.dtos.out.EnderecosResponseDTO;
import br.com.kadoozin.reservas.project.entities.Enderecos;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EnderecosMapper {
    @Mapping(target = "id", ignore = true)
    Enderecos toEntity (EnderecosRequestDTO request);

    EnderecosResponseDTO toResponse (Enderecos entity);

    List<EnderecosResponseDTO> toResponseList (List<Enderecos> entities);
}
