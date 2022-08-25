package com.betacom.train.service.impl;

import java.util.List;

import com.betacom.train.model.Utente;
import com.betacom.train.repository.UtenteRepository;
import com.betacom.train.service.UtenteService;

public class UtenteServiceImpl implements UtenteService {
	
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
	public Utente utenteByEmail(String email) {
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
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/mark5041/TrainProject.git
	}

}
