package com.betacom.train.service.impl;

import java.util.List;

import com.betacom.train.model.CartaFedelta;
import com.betacom.train.repository.CartaFedeltaRepository;
import com.betacom.train.service.CartaFedeltaService;

public class CartaFedeltaServiceImpl implements CartaFedeltaService{
	
	CartaFedeltaRepository cr;
	
	@Override
	public void saveCartaFedelta(CartaFedelta cartaFedelta) {
		cr.save(cartaFedelta);
	}

	@Override
	public List<CartaFedelta> getCarte() {
		return cr.findAll();
	}
}