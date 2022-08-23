package com.betacom.train.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.betacom.train.model.TrattaTreno;

public interface TrattaTrenoRepository {
	
	@Query(value = "select * from tratta where nome = ?1", nativeQuery = true)
	public List<TrattaTreno> findTrattaByName(String nome);
}