package com.betacom.train.service.impl;

import java.util.List;

import com.betacom.train.model.TrattaTreno;
import com.betacom.train.repository.TrattaTrenoRepository;
import com.betacom.train.service.TrattaTrenoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrattaTrenoServiceImpl implements TrattaTrenoService {

	@Autowired
	TrattaTrenoRepository ttr;
	
	@Override
	public void saveTrattaTreno(TrattaTreno trattaTreno) {
		ttr.save(trattaTreno);
	}

	@Override
	public List<TrattaTreno> getTratteTreni() {
		return ttr.findAll();
	}

	@Override
	public List<TrattaTreno> findTrattaTrenoByName(String nome) {
		return ttr.findTrattaByName(nome);
	}

	@Override
	public List<String[]> getInfoTratte() {
		return ttr.getInfoTratte();
	}
	
	
}
