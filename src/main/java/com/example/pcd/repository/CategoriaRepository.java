package com.example.pcd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pcd.models.pcd.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
