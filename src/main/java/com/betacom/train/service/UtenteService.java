package com.betacom.train.service;

import java.util.List;

import com.betacom.train.model.Utente;

public interface UtenteService {
	void saveCliente(Utente utente);
	void deleteCliente(Utente utente);
	List<Utente> getUtenti();
	Utente utenteByEmail(String email);
	void enableUtente(String id);
	void disableUtente(String id);
	void confermaRegUtente(String email);
}
