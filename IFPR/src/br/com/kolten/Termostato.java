package br.com.kolten;

public class Termostato {
	int tempAtual;
	private int tempDesejada;
	int tempMin;
	int tempMax;
	
	public int getTempDesejada() {
		return tempDesejada;
	}
	
	public void setTempDesejada(int tempDesejada) {
		if ( (tempDesejada >= tempMin) && 
		   (tempDesejada <= tempMax) )
			this.tempDesejada = tempDesejada;
		else throw new IllegalArgumentException("Temperatura Incorreta");
	}
}
