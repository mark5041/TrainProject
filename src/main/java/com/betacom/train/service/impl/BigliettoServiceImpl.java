package com.betacom.train.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.betacom.train.model.Biglietto;
import com.betacom.train.repository.BigliettoRepository;
import com.betacom.train.service.BigliettoService;

public class BigliettoServiceImpl implements BigliettoService {

	@Autowired
	BigliettoRepository br;

	@Override
	public void saveBiglietto(Biglietto biglietto) {
		br.save(biglietto);

	}

	@Override
	public List<Biglietto> getBiglietto() {
		return br.findAll();
	}

	@Override
	public List<String[]> getBiglietti(String email) {
		return br.;
	}

	@Override
	public void BigliettoDisponibile(String id) {
		br.BigliettoDisponibile(id);
	}

	@Override
	public void BigliettoNonDisponibile(String id) {
		br.BigliettoNonDisponibile(id);
	}

	@Override
	public void deletePrenotazione(Biglietto biglietto) {
		br.delete(biglietto);

	}

}