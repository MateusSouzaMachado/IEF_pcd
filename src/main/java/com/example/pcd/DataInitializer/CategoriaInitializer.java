package com.example.pcd.DataInitializer;

import com.example.pcd.models.pcd.Categoria;
import com.example.pcd.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@DataInitializerType
@Component
public class CategoriaInitializer {

    @Autowired
    private CategoriaRepository categoriaRepository;

    private String[] categorias = {
            "Deficiência física",
            "Deficiência intelectual",
            "Deficiência mental",
            "Deficiência múltipla",
            "Deficiência psicossocial",
            "Deficiência cognitiva",
            "Deficiência sensorial",
            "Deficiência temporária (ex.: recuperação de cirurgia)"
    };

    public void init(){
        if(categoriaRepository.count() == 0){
            for(String nomeCategoria : categorias){
                    categoriaRepository.save(new Categoria(nomeCategoria));
            }
        }
    }
}
