package com.betacom.train.service;

import java.util.List;
import java.util.Optional;

import com.betacom.train.model.Tratta;

public interface TrattaService {
	void saveTratta(Tratta tratta);
	List<Tratta> getTratte();
	void trattaDisponibile(Long id);
	void trattaNonDisponibile(Long id);
	Optional<Tratta> findTratta(Long id);
}
