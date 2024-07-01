package com.example.pcd.Controller;

import com.example.pcd.Form.Pessoa.PessoaForm;
import com.example.pcd.repository.PessoaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoa")
    public String index(){

        return "pessoa/listar";
    }

    @GetMapping("/pessoa/create")
    public String create(Model model) {
        model.addAttribute("pessoaForm", new PessoaForm());
        return "pessoa/create";
    }

    @PostMapping("/pessoa/create")
    public String create(@Valid PessoaForm pessoaForm, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()){
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/pessoa/create";
        }
        redirectAttributes.addFlashAttribute("mensagemSucesso", "Salvo com sucesso!");
        pessoaRepository.save(pessoaForm.toEntity());
        return  "redirect:/pessoa/create";
    }


}
