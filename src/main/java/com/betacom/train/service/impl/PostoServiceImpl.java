package com.betacom.train.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.train.model.Posto;
import com.betacom.train.repository.PostoRepository;
import com.betacom.train.service.PostoService;

@Service
public class PostoServiceImpl implements PostoService {
	
	@Autowired
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