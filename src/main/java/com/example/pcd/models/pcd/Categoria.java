package com.example.pcd.models.pcd;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Categoria")
@EqualsAndHashCode(of="id")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tip;

    @ManyToOne
    @JoinColumn(name="Deficiencia_id")
    private Deficiencia deficiencia;
}
