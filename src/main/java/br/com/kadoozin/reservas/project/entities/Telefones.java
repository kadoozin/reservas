package br.com.kadoozin.reservas.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tb_telefone")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Telefones {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DDD", nullable = false)
    private String ddd;

    @Column(name = "Número", nullable = false)
    private String numero;
}
