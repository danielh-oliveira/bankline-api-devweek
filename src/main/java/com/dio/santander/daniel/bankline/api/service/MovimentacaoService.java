package com.dio.santander.daniel.bankline.api.service;

import com.dio.santander.daniel.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.daniel.bankline.api.model.Movimentacao;
import com.dio.santander.daniel.bankline.api.model.MovimentacaoTipo;
import com.dio.santander.daniel.bankline.api.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MovimentacaoService {
    @Autowired
    private MovimentacaoRepository repository;

    public void save(NovaMovimentacao novaMovimentacao) {
        Movimentacao movimentacao = new Movimentacao();

        Double valor = novaMovimentacao.getTipo() == MovimentacaoTipo.RECEITA ?
                novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;

        movimentacao.setDataHora(LocalDateTime.now());
        movimentacao.setDescricao(novaMovimentacao.getDescricao());
        movimentacao.setIdConta(movimentacao.getIdConta());
        movimentacao.setTipo(movimentacao.getTipo());
        movimentacao.setValor(valor);



        repository.save(movimentacao);
    }
}
