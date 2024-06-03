package com.example.pcd.models.usuario;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@Setter
@Table(name="Usuario")
@EqualsAndHashCode(of="id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false, unique=true)
    private String email;

    @Column(nullable = false, unique=true, length = 14)
    private String cpf;

    @Column(name = "ativo", nullable = true)
    @ColumnDefault("true")
    private boolean ativo = true;

}
