package com.betacom.train.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.betacom.train.model.Utente;


public interface UtenteRepository extends JpaRepository<Utente, Long> {
	
	@Modifying
	@Transactional
	@Query(value = "update utente set enable = 1 where email = ?1", nativeQuery = true)
	public void enableUtente();
	
	@Modifying
	@Transactional
	@Query(value = "update utente set enable = 0 where email = ?1", nativeQuery = true)
	public void disableUtente();
	
	@Query(value = "select * from utente where email = 1", nativeQuery = true)
	public Utente findByEmail(String email);
}
