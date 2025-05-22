package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.Model.Deficiencia;
import com.example.demo.Repository.DeficienciaRepository;


@SpringBootTest
@AutoConfigureMockMvc
public class PessoaTestSemPessoa {

    @Autowired
    private MockMvc mv;

    @Autowired
    private DeficienciaRepository dr;

    

    @Test
    @DisplayName("Adiciona e altera uma pessoa.")
    void caso1() throws Exception {

        Deficiencia d1 = dr.findById(1L).orElseThrow();

        mv.perform(
            post("/pessoa/create")
            .contentType(MediaType.APPLICATION_FORM_URLENCODED)
            .param("nome", "Teste 1")
            .param("nascimento", "2000-01-01")
            .param("sexo", "1")
            .param("deficiencia", String.valueOf(d1.getId()))
            .param("cep", "12345-678")
            .param("numero", "0")
            .param("complemento", "abacate")
            .param("bairro", "1")
        ).andExpect(status().is3xxRedirection());
    }
}
