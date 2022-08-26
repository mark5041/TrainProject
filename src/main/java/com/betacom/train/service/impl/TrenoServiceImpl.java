package com.betacom.train.service.impl;

import java.util.List;

import com.betacom.train.model.Treno;
import com.betacom.train.repository.TrenoRepository;
import com.betacom.train.service.TrenoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrenoServiceImpl implements TrenoService{

	@Autowired
	TrenoRepository tr;
	
	@Override
	public void saveTreno(Treno treno) {
		tr.save(treno);
	}

	@Override
	public List<Treno> getTreni() {
		return tr.findAll();
	}

	@Override
	public List<Treno> getTreniDisponibili() {
		return tr.getTreniDisponibili();
	}

	@Override
	public Treno findByCodeTreno(String id) {
		return tr.findByCodeTreno(id);
	}

	@Override
	public void trenoDisponibile(String id) {
		tr.trenoDisponibile(id);
	}

	@Override
	public void trenoNonDisponibile(String id) {
		tr.trenoNonDisponibile(id);
	}
	
}
