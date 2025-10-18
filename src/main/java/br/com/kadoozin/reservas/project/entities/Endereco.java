package br.com.kadoozin.reservas.project.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "Número")
    private String numero;

    @Column(name = "Rua")
    private String rua;

    @Column(name = "Complemento")
    private String complemento;

    @Column(name = "CEP", nullable = false)
    private String cep;

    @Column(name = "Município", nullable = false)
    private String municipio;

    @Column(name = "Cidade", nullable = false)
    private String cidade;

    @Column(name = "Estado", nullable = false)
    private String estado;

    @Column(name = "País", nullable = false)
    private String pais;
}
