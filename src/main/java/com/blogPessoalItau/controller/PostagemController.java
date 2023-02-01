package com.blogPessoalItau.controller;

import com.blogPessoalItau.model.Postagem;
import com.blogPessoalItau.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postagem")
public class PostagemController {

    @Autowired
    PostagemRepository postagemRepository;

    @GetMapping
    public List<Postagem> listarPostagens(){
        List<Postagem> postagens = postagemRepository.findAll();
        return postagens;
    }
}
