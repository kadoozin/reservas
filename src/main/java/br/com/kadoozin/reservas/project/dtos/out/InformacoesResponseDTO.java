package br.com.kadoozin.reservas.project.dtos.out;

import java.time.LocalDate;

public record InformacoesResponseDTO(
        Long id,
        String nome,
        String sobrenome,
        LocalDate dataNascimento,
        String cpf,
        String email
) {}
