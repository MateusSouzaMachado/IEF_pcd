package com.example.pcd.models.pcd;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import com.example.pcd.models.localizacao.Endereco;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="Pessoa")
@EqualsAndHashCode(of="id")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String nome_responsavel;

    @Column(nullable = false)
    private char aprovado;

    @Column(nullable = false)
    private Date data_nascimento;

}
