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
public class Treno {
	
	@Id
	private String idTreno;
	
	@Column(nullable = false)
	private boolean stato = true;
	
	@OneToMany(mappedBy = "treno", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<TrattaTreno> trattatreno = new ArrayList<TrattaTreno>();
	
	/* 
		insert into treno(id_treno, stato) values ('RC101XD', '1'); 
		insert into treno(id_treno, stato) values ('DC737EU', '1');
		insert into treno(id_treno, stato) values ('DR648TV', '0');
		insert into treno(id_treno, stato) values ('MV696VM', '0'); 
		insert into treno(id_treno, stato) values ('TS319DD', '0');
		
		insert into carta_fedelta(id_carta, sconto) values ('silver', '10'); 
		insert into carta_fedelta(id_carta, sconto) values ('gold', '20'); 
		insert into carta_fedelta(id_carta, sconto) values ('platinum', '30'); 
		
		
	
	*/
}
