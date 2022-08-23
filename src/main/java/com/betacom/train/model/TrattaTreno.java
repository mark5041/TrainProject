package com.betacom.train.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
public class TrattaTreno {

	@Id
	@Column(nullable = false, unique = false)
	private Long idTrattaTreno;

	@ManyToOne
	@JoinColumn(name = "id_treno", nullable = false)
	private Treno treno;

	@ManyToOne
	@JoinColumn(name = "id_tratta", nullable = false)
	private Tratta tratta;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
	private Date orario;
	
	@OneToMany(mappedBy = "trattatreno", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Biglietto> biglietto = new HashSet<Biglietto>();
	
	@OneToMany(mappedBy = "trattatreno", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Posto> posto = new ArrayList<Posto>();
}
