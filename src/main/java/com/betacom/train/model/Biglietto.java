package com.betacom.train.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table
@Data
public class Biglietto {
	
	
	@Id
	private String idBiglietto;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dataAcquisto;
	
	@Column(nullable = false)
	private double prezzo;
	
	@Column(nullable = false)
	private boolean minorenne;
	

	@Column(nullable = false)
	private String numeroPosto;
	
	@ManyToOne
	@JoinColumn(name = "email", nullable = false)
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name = "id_tratta_treno", nullable = false)
	private TrattaTreno trattatreno;
	
	
}
