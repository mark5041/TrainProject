package com.betacom.train.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.betacom.train.model.Posto;

@Repository
public interface PostoRepository extends JpaRepository<Posto, Long> {
	@Query(value = "select * from posto where stato_posto = 1", nativeQuery = true)
	List<Posto> getPostiDisponibili();
	
	@Modifying
	@Transactional
	@Query(value = "update posto set stato_posto = 1 where id_posto = ?1", nativeQuery = true)
	void postoDisponibile(Long id);
	
	@Modifying
	@Transactional
	@Query(value = "update posto set stato_posto = 0 where id_posto = ?1", nativeQuery = true)
	void postoNonDisponibile(Long id);
	
	
}
