package com.betacom.train.service;

import java.util.List;
import java.util.Optional;

import com.betacom.train.model.Biglietto;

public interface BigliettoService {

        void saveBiglietto(Biglietto biglietto);
		List<Biglietto> getBiglietto();
		Optional<Biglietto> findById(String id);
		List<String[]> getBiglietti(String email);
		void deletePrenotazione(Biglietto biglietto);
		
	}


