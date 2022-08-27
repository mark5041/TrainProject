package com.betacom.train.service;

import java.util.List;

import com.betacom.train.model.TrattaTreno;

public interface TrattaTrenoService {
	void saveTrattaTreno(TrattaTreno trattaTreno);
	List<TrattaTreno> getTratteTreni();
	List<TrattaTreno> findTrattaTrenoByName(String nome);
	List<String[]> getInfoTratte();
	List<String[]> getInfoTratteDisponibili();
	List<String[]> getInfoTratteByNome(String partenza, String arrivo);
}
