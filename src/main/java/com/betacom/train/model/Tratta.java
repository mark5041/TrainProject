package com.betacom.train.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table
@Data
public class Tratta {
	
	@Id
	@Column(nullable = false, unique = true)
	private Long idTratta;
	
	@Column(nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "tratta", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<TrattaTreno> trattatreno = new ArrayList<TrattaTreno>();
}
