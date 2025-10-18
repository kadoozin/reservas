package br.com.kadoozin.reservas.project.dtos.in;

public record EnderecosRequestDTO(
        String numero,
        String rua,
        String complemento,
        String cep,
        String municipio,
        String cidade,
        String estado,
        String pais
) {}