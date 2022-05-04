package com.dio.santander.daniel.bankline.api.repository;

import com.dio.santander.daniel.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
