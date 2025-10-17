package br.com.kadoozin.reservas.project.dtos.out;

public record TelefoneResponseDTO(
        Long id,
        String ddd,
        String numero
) {}