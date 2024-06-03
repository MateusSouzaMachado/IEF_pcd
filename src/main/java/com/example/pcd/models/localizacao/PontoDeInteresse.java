package com.example.pcd.models.localizacao;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="PontoDeInteresse")
@EqualsAndHashCode(of="id")
public class PontoDeInteresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tip;

    @Column(nullable = false)
    private String contato;

    @ManyToOne
    @JoinColumn(name="Endereco_id")
    private Endereco endereco;
}
