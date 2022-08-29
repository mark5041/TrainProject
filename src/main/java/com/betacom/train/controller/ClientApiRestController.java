package com.betacom.train.controller;

import java.util.List;

import com.betacom.train.model.Utente;
import com.betacom.train.service.TrattaTrenoService;
import com.betacom.train.service.UtenteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.betacom.train.security.BCryptEncoder;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientApiRestController {
	
	@Autowired
	TrattaTrenoService ttr;
	
	@Autowired
	UtenteService user;
	
	@GetMapping("/login")
	public ResponseEntity<Utente> loginUtente(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
		if(user.utenteByEmail(email).isPresent()) {
			Utente utente = user.utenteByEmail(email).get();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if(encoder.matches(password, utente.getPassword())) {
				return ResponseEntity.ok(utente);
			} else {
				return ResponseEntity.ok(null);
			}
		} else {
			return ResponseEntity.ok(null);
		}
	}
	
	@GetMapping("/registra")
	public void registraUtente(@RequestParam(name = "utente") Utente utente) {
		utente.setPassword(BCryptEncoder.encode(utente.getPassword()));
		user.saveCliente(utente);
	}
	

	@GetMapping("/tratte")
	public ResponseEntity<List<String[]>> getInfoTratte() {
		return ResponseEntity.ok(ttr.getInfoTratte());
	}
	
	@GetMapping("/disponibili")
	public ResponseEntity<List<String[]>> getInfoTratteDisonibili() {
		return ResponseEntity.ok(ttr.getInfoTratteDisponibili());
	}
	
	@GetMapping("/tratta/{nome}")
	public ResponseEntity<List<String[]>> getInfoTratteByNome(@PathVariable("nome") String nome) {
		String[] parts = nome.split("-");
		String partenza = parts[0];
		String arrivo = parts[1];
		return ResponseEntity.ok(ttr.getInfoTratteByNome(partenza, arrivo));
	}
	
}
