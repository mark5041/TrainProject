package com.betacom.train.service;

import java.util.List;

import com.betacom.train.model.Tratta;

public interface TrattaService {

	 void saveTratta(Tratta tratta);
	 List<Tratta> getAll();
	 void deleteTratta(Long id);

}
