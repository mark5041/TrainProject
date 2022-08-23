package com.betacom.train.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class CartaFedelta {
	@Id
	@Column(nullable = false, unique = true)
	private String idCarta;
	
	@Column(nullable = false)
	private int sconto;
	
}
