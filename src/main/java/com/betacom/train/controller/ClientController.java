package com.betacom.train.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.betacom.ordini.businesscomponent.Carrello;
import it.betacom.ordini.model.Articolo;

import com.betacom.train.email.EmailSenderService;
import com.betacom.train.model.Utente;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.betacom.train.service.UtenteService;

@Controller
@Scope("session")
public class ClientController {
	
	@Autowired
	UtenteService utenteService;
	
	@Autowired
	EmailSenderService emailService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("utente_log", (Utente) session.getAttribute("utente"));
		
		return mv;
	}
	
	/******************LOGIN UTENTE***************/
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpSession session) {
		
		if(session.getAttribute("utente_log") != null) {
			
			return new ModelAndView("redirect:/logout");
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		
		mv.addObject("utente", new Utente());
		
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView controlloLogin(
							@RequestParam("email") String user, 
							@RequestParam("password") String pass,
							HttpSession session) {
		
		if(utenteService.utenteByEmail(user).isPresent()) {
			
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if(encoder.matches(pass, utenteService.utenteByEmail(user).get().getPassword())) {
				
				session.setAttribute("utente_log", utenteService.utenteByEmail(user).get());
				
				return new ModelAndView("redirect:/home");
				
			} else {
				return new ModelAndView("redirect:/");
			}
		} else {
			return new ModelAndView("redirect:/");
		}
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView acquisti(HttpSession session) {
		
		if(session.getAttribute("utente_log") == null) {
			
			return new ModelAndView("redirect:/login");
			
		} else {
			emailService.sendEmail("mario.rossi40104@gmail.com", "conferma", "<h1>Hello there!</h1>");
			ModelAndView mv = new ModelAndView();
			mv.setViewName("home");
			mv.addObject("utente_log", session.getAttribute("utente_log"));
			return mv;
		}
	}
}
