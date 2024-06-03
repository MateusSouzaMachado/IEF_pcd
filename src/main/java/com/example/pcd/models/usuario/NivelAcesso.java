package com.example.pcd.models.usuario;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="NivelAcesso")
@EqualsAndHashCode(of="id")
public class NivelAcesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tip;

    @ManyToOne
    @JoinColumn(name="Usuario_id")
    private Usuario usuario;
}
