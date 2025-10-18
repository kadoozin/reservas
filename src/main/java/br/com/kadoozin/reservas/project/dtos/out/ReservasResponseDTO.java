package br.com.kadoozin.reservas.project.dtos.out;

import java.time.LocalDateTime;

public record ReservasResponseDTO(
        Long id,
        String nome,
        String quarto,
        LocalDateTime checkin,
        LocalDateTime checkout
) {
}
