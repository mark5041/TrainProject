package com.betacom.train.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betacom.train.model.Utente;
import com.betacom.train.repository.UtenteRepository;
import com.betacom.train.service.UtenteService;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
	UtenteRepository ur;
	
	@Override
	public void saveCliente(Utente utente) {
		ur.save(utente);
		
	}

	@Override
	public void deleteCliente(Utente utente) {
		ur.delete(utente);
		
	}

	@Override
	public List<Utente> getUtenti() {
		return ur.findAll();
	}

	@Override
	public Optional<Utente> utenteByEmail(String email) {
		return ur.findByEmail(email);
	}

	@Override
	public void enableUtente(String id) {
		ur.enableUtente();
	}

	@Override
	public void disableUtente(String id) {
		ur.disableUtente();
	}

	@Override
	public void confermaRegUtente(String email) {
	}
}
