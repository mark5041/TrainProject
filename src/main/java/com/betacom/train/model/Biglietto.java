package com.betacom.train.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table
@Data
public class Biglietto {
	@Id
	@Column(nullable = false, unique = true)
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
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "email", nullable = false, unique = false)
	private Utente utente;
	
	@OneToOne(optional = false, orphanRemoval = true) 
	@MapsId
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Long Idposto; 
}
