package com.betacom.train.service;

import java.util.List;

import com.betacom.train.model.Biglietto;

public interface BigliettoService {

        void saveBiglietto(Biglietto biglietto);
		List<Biglietto> getBiglietto();
		List<String[]> getBiglietti(String email);
		void BigliettoDisponibile(String id);
		void BigliettoNonDisponibile(String id);
		void deletePrenotazione(Biglietto biglietto);
		
	}


