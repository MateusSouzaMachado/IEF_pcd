package com.example.pcd.Form.Pessoa;

import com.example.pcd.models.pcd.Pessoa;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PessoaForm {


    @NotBlank(message = "Preencha o campo nome.")
    private String nome;

    public Pessoa toEntity(){
        return new Pessoa(nome);
    }
}
