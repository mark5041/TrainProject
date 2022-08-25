package com.betacom.train.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.betacom.train.model.Utente;
import com.betacom.train.repository.UtenteRepository;



@Configuration
public class UtentiDetailsService implements UserDetailsService {
	
	
	private UtenteRepository utenteRepo;

	public UtentiDetailsService(UtenteRepository utenteRepository) {
		this.utenteRepo = utenteRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		try {
			
			Utente utente = utenteRepo.findByEmail(email).get();
			
			if(utente != null) {
				
				System.out.println("--------PWD USERDETAILS-------- " + utente.getPassword());
				
				return User.withUsername(utente.getUsername())
							.accountLocked(!utente.isEnabled())
							.password(utente.getPassword())
							.roles(utente.getRole())
							.build();
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		throw new UsernameNotFoundException(email);
	}

}
