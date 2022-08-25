package com.betacom.train.businesscomponent;

import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class Prenotazione {
	private Hashtable<String, String[]> biglietti = new Hashtable<String, String[]>();
	private int totBiglietti;

	public Prenotazione() {
		totBiglietti = 0;
	}

	public void aggiungiBiglietto(String idBiglietto, String email, Date data, double prezzo, boolean minorenne,
			String numeroPosto) {
		String[] record = { idBiglietto, email, String.valueOf(data), Double.toString(prezzo),
				String.valueOf(minorenne), numeroPosto };
		totBiglietti++;
		biglietti.put(idBiglietto, record);
	}

	public void rimuoviBiglietto(String idBiglietto) {
		totBiglietti--;
		biglietti.remove(idBiglietto);
	}
	
	public Enumeration<String[]> listaBiglietti() {
		return biglietti.elements();
	}

	public double totaleComplessivo() {
		double totale = 0.00;
		Enumeration<String[]> enumerazione = listaBiglietti();
		String[] dati;
		while (enumerazione.hasMoreElements()) {
			dati = enumerazione.nextElement();
			totale += Double.parseDouble(dati[2]) * totBiglietti;
		}
		return totale;
	}

	public double totaleParziale(String idBiglietto) {
		String[] dati = biglietti.get(idBiglietto);
		return Double.valueOf(dati[2]);
	}
}
