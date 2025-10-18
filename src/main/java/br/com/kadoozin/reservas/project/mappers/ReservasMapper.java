package br.com.kadoozin.reservas.project.mappers;

import br.com.kadoozin.reservas.project.dtos.in.ReservasRequestDTO;
import br.com.kadoozin.reservas.project.dtos.out.ReservasResponseDTO;
import br.com.kadoozin.reservas.project.entities.Reservas;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservasMapper {
    @Mapping(target = "id", ignore = true)
    Reservas toEntity (ReservasRequestDTO request);

    ReservasResponseDTO toResponse (Reservas entity);

    List<ReservasResponseDTO> toResponseList(List<Reservas> entities);
}
