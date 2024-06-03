package com.example.pcd.models.pcd;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Deficiencia")
@EqualsAndHashCode(of="id")
public class Deficiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name="Categoria_id")
    private Categoria categoria;
}
