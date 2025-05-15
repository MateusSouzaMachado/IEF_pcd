package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.sql.Timestamp;



@SpringBootTest
@AutoConfigureMockMvc
public class DeficienciaTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Verifica se o endpont /deficiencia responde 200 (OK)")
    void index() throws Exception {
        mockMvc.perform(
            get("/deficiencia")
        ).andExpect(status().isOk());
    }

    @Test
    @DisplayName("Adiciona e altera uma deficiência.")
    void createAndUpdate() throws Exception {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        mockMvc.perform(
            post("/deficiencia/create")
            .contentType(MediaType.APPLICATION_FORM_URLENCODED)
            .param("nome", "Teste" + timestamp)
            .param("categoria", "1")
        ).andExpect(status().is3xxRedirection());
    }

}
