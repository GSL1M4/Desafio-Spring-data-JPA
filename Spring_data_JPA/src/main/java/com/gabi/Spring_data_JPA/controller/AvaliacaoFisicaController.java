package com.gabi.Spring_data_JPA.controller;

import com.gabi.Spring_data_JPA.entity.AvaliacaoFisica;
import com.gabi.Spring_data_JPA.entity.form.AvaliacaoFisicaForm;
import com.gabi.Spring_data_JPA.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }

}