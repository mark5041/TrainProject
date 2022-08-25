package com.betacom.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betacom.train.model.CartaFedelta;

@Repository
public interface CartaFedeltaRepository extends JpaRepository<CartaFedelta, String> {
}