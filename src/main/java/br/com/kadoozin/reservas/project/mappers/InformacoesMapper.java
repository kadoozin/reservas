package br.com.kadoozin.reservas.project.mappers;

import br.com.kadoozin.reservas.project.dtos.in.InformacoesRequestDTO;
import br.com.kadoozin.reservas.project.dtos.out.InformacoesResponseDTO;
import br.com.kadoozin.reservas.project.entities.Informacoes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InformacoesMapper {
    @Mapping(target = "id", ignore = true)
    Informacoes toEntity (InformacoesRequestDTO request);

    InformacoesResponseDTO toResponse (Informacoes entity);

    List<InformacoesResponseDTO> toResponseList (List<Informacoes> entities);
}
