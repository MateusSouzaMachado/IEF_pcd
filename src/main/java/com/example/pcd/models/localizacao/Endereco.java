package com.example.pcd.models.localizacao;

import com.example.pcd.models.pcd.Pessoa;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Endereco")
@EqualsAndHashCode(of="id")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private int numero;

    @Column(nullable = false)
    private String cep;

    @ManyToOne
    @JoinColumn(name="Bairro_id")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name="Pessoa_id")
    private Pessoa pessoa;

}
