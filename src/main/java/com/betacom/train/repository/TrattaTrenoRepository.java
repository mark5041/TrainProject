package com.betacom.train.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.betacom.train.model.TrattaTreno;

@Repository
public interface TrattaTrenoRepository extends JpaRepository<TrattaTreno, Long> {
	
	@Query(value = "select * from tratta where nome = ?1", nativeQuery = true)
	public List<TrattaTreno> findTrattaByName(String nome);
	
	@Query(value = "select dinstinct treno.id_treno, tratta.nome, tratta_treno.orario from tratta_treno join tratta on tratta.id_tratta = tratta_treno.id_tratta join treno on treno.id_treno = tratta_treno.id_treno", nativeQuery = true)
	public List<String[]> getInfoTratte();
	
}