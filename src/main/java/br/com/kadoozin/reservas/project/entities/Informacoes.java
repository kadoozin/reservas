package br.com.kadoozin.reservas.project.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Informacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Nome", nullable = false)
    private String nome;

    @Column(name = "Sobrenome", nullable = false)
    private String sobrenome;

    @Column(name = "DataNascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Column(name = "Email", nullable = false, unique = false)
    private String email;
}
