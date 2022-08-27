package com.betacom.train.controller;

import java.util.List;

import com.betacom.train.service.TrattaTrenoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/utente")
@CrossOrigin(origins = "")
public class ClientApiRestController {
	
	@Autowired
	TrattaTrenoService ttr;
	

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
