package com.betacom.train.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Posto {
	
	@Id
	private Long idPosto; 
	
	@ManyToOne
	@JoinColumn(name = "id_tratta_treno", nullable = false)
	private TrattaTreno trattatreno;
	
	@Column(nullable = false)
	private String numeroPosto;
	
	@Column(nullable = false)
	private boolean statoPosto = true;
	
	@Column(nullable = false)
	private String classe;
	
}
