package br.com.kadoozin.reservas.project.dtos.in;

import java.time.LocalDate;

public record InformacoesRequestDTO(
        String nome,
        String sobrenome,
        LocalDate dataNascimento,
        String cpf,
        String email
) {}