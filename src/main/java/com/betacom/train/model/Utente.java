package com.betacom.train.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.Data;

@Entity
@Table
@Data
public class Utente implements Serializable {
	private static final long serialVersionUID = -5550977500721620151L;
	
	@Id
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	@Column(nullable = false)
	private String indirizzo;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date data;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private boolean enabled = true;

	@Column
	private String role = "USER";
	
	@OneToMany(mappedBy = "utente", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Biglietto> biglietto = new HashSet<Biglietto>();
	
	@ManyToOne
	@JoinColumn(name = "idCarta", nullable = false)
	private CartaFedelta cartaFedelta;
	
	
	
}
