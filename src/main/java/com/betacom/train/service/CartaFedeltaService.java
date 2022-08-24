package com.betacom.train.service;

import java.util.List;

import com.betacom.train.model.CartaFedelta;

public interface CartaFedeltaService {
	void saveCartaFedelta(CartaFedelta cartaFedelta);
	List<CartaFedelta> getCarte();
}