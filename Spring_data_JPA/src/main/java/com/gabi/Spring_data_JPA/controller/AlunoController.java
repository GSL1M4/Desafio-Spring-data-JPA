package com.gabi.Spring_data_JPA.controller;

import com.gabi.Spring_data_JPA.entity.Aluno;
import com.gabi.Spring_data_JPA.entity.AvaliacaoFisica;
import com.gabi.Spring_data_JPA.entity.form.AlunoForm;
import com.gabi.Spring_data_JPA.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                              String dataDeNacimento) {
        return service.getAll(dataDeNacimento);
    }


}
