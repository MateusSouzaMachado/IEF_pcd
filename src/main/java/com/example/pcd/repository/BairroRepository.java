package com.example.pcd.repository;


import com.example.pcd.models.localizacao.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<Bairro,Long> {
}
