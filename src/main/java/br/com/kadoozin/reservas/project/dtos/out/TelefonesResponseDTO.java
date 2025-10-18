package br.com.kadoozin.reservas.project.dtos.out;

public record TelefonesResponseDTO(
        Long id,
        String ddd,
        String numero
) {}