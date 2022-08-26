package com.betacom.train.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.train.model.CartaFedelta;
import com.betacom.train.repository.CartaFedeltaRepository;
import com.betacom.train.service.CartaFedeltaService;

@Service
public class CartaFedeltaServiceImpl implements CartaFedeltaService{
	
	@Autowired
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