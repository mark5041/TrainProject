package com.betacom.train.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.betacom.train.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
	
	@Modifying
	@Transactional
	@Query(value = "update utente set enable = 1 where email = ?1", nativeQuery = true)
	public void enableUtente();
	
	@Modifying
	@Transactional
	@Query(value = "update utente set enable = 0 where email = ?1", nativeQuery = true)
	public void disableUtente();
	
	@Query(value = "select * from utente where email = ?1", nativeQuery = true)
	Optional<Utente> findByEmail(String email);
}
