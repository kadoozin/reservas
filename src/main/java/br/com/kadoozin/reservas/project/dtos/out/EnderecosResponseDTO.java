package br.com.kadoozin.reservas.project.dtos.out;

public record EnderecosResponseDTO(
        Long id,
        String numero,
        String rua,
        String complemento,
        String cep,
        String municipio,
        String cidade,
        String estado,
        String pais
) {}