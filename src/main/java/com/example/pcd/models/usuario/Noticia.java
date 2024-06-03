package com.example.pcd.models.usuario;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Noticia")
@EqualsAndHashCode(of="id")
public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String img;

    @ManyToOne
    @JoinColumn(name="Usuario_id")
    private Usuario usuario;
}
