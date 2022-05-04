package com.dio.santander.daniel.bankline.api.repository;

import com.dio.santander.daniel.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
