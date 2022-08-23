package com.betacom.train.service;

import java.util.List;

import com.betacom.train.model.Posto;


public interface PostoService {
	List<Posto> getPostiDisponibili(Long id_tratta);
	void postoDisponibile(Long id);
	void postoNonDisponibile(Long id);
}
