package com.example.demo.Form.Pessoa;

import com.example.demo.Model.Pessoa;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PessoaForm {

    @NotBlank(message = "Preencha o campo nome.")
    private String nome;

    @NotNull(message = "Preencha o campo data de nascimento.")
    private LocalDate nascimento;


    public Pessoa toEntity(){
        return new Pessoa(nome, nascimento);
    }

    public PessoaForm(Pessoa pessoa){
        this.nome = pessoa.getNome();
        this.nascimento = pessoa.getNascimento();
    }



}