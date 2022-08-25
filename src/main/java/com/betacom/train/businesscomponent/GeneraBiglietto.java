package com.betacom.train.businesscomponent;

import java.util.Random;

public class GeneraBiglietto {
	
	private int len = 5;
	private String lettereNumeri = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	Random rnd = new Random();
	
	public String generaIdPrenotazione() {
		char[] idP = new char[len];
		for(int i = 0; i < len; i++) {
			idP[i] = lettereNumeri.charAt(rnd.nextInt(37));
		}
		return new String(idP);
	}
}