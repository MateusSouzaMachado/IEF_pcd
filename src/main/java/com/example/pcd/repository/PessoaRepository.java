package com.example.pcd.repository;

import com.example.pcd.models.pcd.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
}
