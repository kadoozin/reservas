package br.com.kadoozin.reservas.project.dtos.in;

import java.time.LocalDateTime;

public record ReservasRequestDTO(
        String nome,
        String quarto,
        LocalDateTime checkin,
        LocalDateTime checkout
) {
}
