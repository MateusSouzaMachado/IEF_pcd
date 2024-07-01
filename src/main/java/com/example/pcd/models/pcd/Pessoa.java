package com.example.pcd.models.pcd;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import com.example.pcd.models.localizacao.Endereco;

import java.util.Date;
import java.util.List;

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

    @Column(nullable = false, unique=true, length = 14)
    private String cpf;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String nome_responsavel;

    @Column(nullable = false)
    private char aprovado;

    @Column(nullable = false)
    private Date data_nascimento;

    @ManyToOne
    @JoinColumn(name="Endereco_id")
    private Endereco endereco;

    @ManyToMany
    private List<Deficiencia> deficiencias;

    public  Pessoa(String nome){
        this.nome=nome;
    }
}
