package br.com.kadoozin.reservas.project.dtos.in;

public record EnderecoRequestDTO(
        String numero,
        String rua,
        String complemento,
        String cep,
        String municipio,
        String cidade,
        String estado,
        String pais
) {}