package com.betacom.train.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.betacom.train.model.Treno;

@Repository
public interface TrenoRepository extends JpaRepository<Treno, String> {
	@Query(value = "select * from treno where stato = 1", nativeQuery = true)
	List<Treno> getTreniDisponibili();;
	
	@Modifying
	@Transactional
	@Query(value = "update treno set stato = 1 where id_treno = ?1", nativeQuery = true)
	void trenoDisponibile(String id);
	
	@Modifying
	@Transactional
	@Query(value = "update treno set stato = 0 where id_treno = ?1", nativeQuery = true)
	void trenoNonDisponibile(String id);
	
	@Query(value = "select * from treno where id_treno = ?1", nativeQuery = true)
	Treno findByCodeTreno(String id);
	
	
	
}
