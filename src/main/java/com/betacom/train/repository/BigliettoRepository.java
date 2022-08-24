package com.betacom.train.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.betacom.train.model.Biglietto;

public interface BigliettoRepository extends JpaRepository<Biglietto, String> {
	@Query(value = "select * from biglietto where statoBiglietto = 1", nativeQuery = true)
	List<Biglietto> getBiglietto();
	
	@Modifying
	@Transactional
	@Query(value = "update biglietto set statoBiglietto = 1 where id_biglietto = ?1", nativeQuery = true)
	void BigliettoDisponibile(String id);
	
	@Modifying
	@Transactional
	@Query(value = "update biglietto set statoBiglietto = 0 where id_biglietto= ?1", nativeQuery = true)
	void BigliettoNonDisponibile(String id);
}
