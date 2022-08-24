package com.betacom.train.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.betacom.train.model.Posto;

public interface PostoRepository extends JpaRepository<Posto, Long> {
	@Query(value = "select * from posto where statoPosto = 1", nativeQuery = true)
	List<Posto> getPostiDisponibili();
	
	@Modifying
	@Transactional
	@Query(value = "update posto set statoPosto = 1 where id_posto = ?1", nativeQuery = true)
	void postoDisponibile(Long id);
	
	@Modifying
	@Transactional
	@Query(value = "update posto set statoPosto = 0 where id_posto = ?1", nativeQuery = true)
	void postoNonDisponibile(Long id);
	
	
}
