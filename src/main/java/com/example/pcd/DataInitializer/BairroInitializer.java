package com.example.pcd.DataInitializer;

import com.example.pcd.models.localizacao.Bairro;
import com.example.pcd.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@DataInitializerType
@Component
public class BairroInitializer {

    @Autowired//dependencia/injeção para evitar criar estancias e variaveis
    private BairroRepository bairroRepository;

    private String[] bairros = {
            "Água Verde",
            "Amizade",
            "Bairro Industrial",
            "Barra do Rio Cerro",
            "Barra do Rio Molha",
            "Boa Vista",
            "Brasília",
            "Centenário",
            "Centro",
            "Chico de Paulo",
            "Cidade Nova",
            "Estrada Nova",
            "Ilha da Figueira",
            "Jaraguá 99",
            "Jaraguá Esquerdo",
            "Jaraguá 84",
            "João Pessoa",
            "Nereu Ramos",
            "Nova Brasília",
            "Nova Esperança",
            "Rau",
            "Rio Cerro I",
            "Rio Cerro II",
            "Rio da Luz",
            "Santa Luzia",
            "Santo Antônio",
            "São Luís",
            "Tifa Martins",
            "Três Rios do Sul",
            "Vila Baependi",
            "Vila Lenzi",
            "Vila Nova"
    };

    public void init(){
        if(bairroRepository.count() == 0){
            for(String nomeBairro : bairros){
                    bairroRepository.save(new Bairro(nomeBairro));
            }
        }
    }
}
