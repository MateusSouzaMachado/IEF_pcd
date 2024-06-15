package com.example.pcd.repository;

import com.example.pcd.models.localizacao.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
