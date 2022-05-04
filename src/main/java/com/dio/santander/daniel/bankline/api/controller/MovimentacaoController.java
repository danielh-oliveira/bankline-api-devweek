package com.dio.santander.daniel.bankline.api.controller;

import com.dio.santander.daniel.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.daniel.bankline.api.dto.NovoCorrentista;
import com.dio.santander.daniel.bankline.api.model.Movimentacao;
import com.dio.santander.daniel.bankline.api.repository.MovimentacaoRepository;
import com.dio.santander.daniel.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao) {
        service.save(movimentacao);
    }
}
