package com.example.pcd.models.usuario;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @ManyToMany
    private List<Usuario> usuarios;
}
