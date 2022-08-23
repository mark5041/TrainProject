package com.betacom.train.repository;

import javax.transaction.Transactional;

import com.betacom.train.model.Tratta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TrattaRepository extends JpaRepository<Tratta, Long> {
	
	@Modifying
	@Transactional
	@Query(value = "update tratta set stato = 1 where id_treno = ?1", nativeQuery = true)
	void trattaDisponibile(Long id);
	
	@Modifying
	@Transactional
	@Query(value = "update tratta set stato = 0 where id_treno = ?1", nativeQuery = true)
	void trattaNonDisponibile(Long id);
	
	
}
