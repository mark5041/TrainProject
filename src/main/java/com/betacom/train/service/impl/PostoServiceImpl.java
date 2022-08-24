package com.betacom.train.service.impl;

import java.util.List;

import com.betacom.train.model.Posto;
import com.betacom.train.repository.PostoRepository;
import com.betacom.train.service.PostoService;

public class PostoServiceImpl implements PostoService {
	
	PostoRepository pr;
	
	@Override
	public List<Posto> getPostiDisponibili(Long id_tratta) {
		return pr.getPostiDisponibili();
	}

	@Override
	public void postoDisponibile(Long id) {
		pr.postoDisponibile(id);
	}

	@Override
	public void postoNonDisponibile(Long id) {
		pr.postoNonDisponibile(id);
	}
}