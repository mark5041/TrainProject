package com.betacom.train.service;

import java.util.List;

import com.betacom.train.model.Treno;

public interface TrenoService {
	void saveTreno(Treno treno);
	List<Treno> getTreni();
	List<Treno> getTreniDisponibili();
	Treno findByCodeTreno(String id);
	void trenoDisponibile(String id);
	void trenoNonDisponibile(String id);
}
