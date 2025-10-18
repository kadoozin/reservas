package br.com.kadoozin.reservas.project.mappers;

import br.com.kadoozin.reservas.project.dtos.in.TelefonesRequestDTO;
import br.com.kadoozin.reservas.project.dtos.out.TelefonesResponseDTO;
import br.com.kadoozin.reservas.project.entities.Telefones;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TelefonesMapper {
    @Mapping(target = "id", ignore = true)
    Telefones toEntity (TelefonesRequestDTO request);

    TelefonesResponseDTO toResponse (Telefones entity);

    List<TelefonesResponseDTO> toResponseList (List<Telefones> entities);
}
