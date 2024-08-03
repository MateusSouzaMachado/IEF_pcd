package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import com.example.demo.Enum.Sexo;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "pessoa")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nome", nullable = false, length = 100, unique = false)
    private String nome;

    @Column(name = "nascimento", nullable = false, unique = false)
    private LocalDate nascimento;

    @Column(name = "ativo", nullable = false)
    @ColumnDefault("true")
    private boolean ativo = true;

    @Column(name="sexo", nullable = false)
    @ColumnDefault("2")
    @Enumerated(EnumType.ORDINAL)
    private Sexo sexo =  Sexo.NAO_INFORMADO;


    public Pessoa(String nome, LocalDate nascimento, Sexo sexo) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

}