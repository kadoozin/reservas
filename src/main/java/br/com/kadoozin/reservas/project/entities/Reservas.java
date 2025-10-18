package br.com.kadoozin.reservas.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.buf.UEncoder;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Hospede", nullable = false)
    private String nome;

    @Column(name = "Quarto", nullable = false)
    private String quarto;

    @Column(name = "Check-in", nullable = false)
    private LocalDateTime checkin;

    @Column(name = "Check-out", nullable = false)
    private LocalDateTime checkout;
}
