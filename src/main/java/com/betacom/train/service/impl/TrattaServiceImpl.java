package com.betacom.train.service.impl;

import java.util.List;
import java.util.Optional;

import com.betacom.train.model.Tratta;
import com.betacom.train.repository.TrattaRepository;
import com.betacom.train.service.TrattaService;

import org.springframework.beans.factory.annotation.Autowired;

public class TrattaServiceImpl implements TrattaService {

	@Autowired
	TrattaRepository tr;
	
	@Override
	public void saveTratta(Tratta tratta) {
		tr.save(tratta);
	}

	@Override
	public List<Tratta> getTratte() {
		return tr.findAll();
	}

	@Override
	public void trattaDisponibile(Long id) {
		tr.trattaDisponibile(id);
	}

	@Override
	public void trattaNonDisponibile(Long id) {
		tr.trattaNonDisponibile(id);
	}

	@Override
	public Optional<Tratta> findTratta(Long id) {
		return tr.findById(id);
	}
	
	
}
