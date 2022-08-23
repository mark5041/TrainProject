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
	@Column(nullable = false, unique = true)
	private Long idPosto; 
	
	@ManyToOne
	@JoinColumn(name = "id_trattatreno", nullable = false)
	private TrattaTreno trattatreno;
	
	@Column(nullable = false)
	private String numeroPosto;
	
	@Column(nullable = false)
	private boolean statoPosto = true;
	
	@Column(nullable = false)
	private String classe;
	
}
