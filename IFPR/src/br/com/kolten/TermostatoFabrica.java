package br.com.kolten;

public class TermostatoFabrica {

	public static void main(String[] args) {
		Termostato fogao = new Termostato();
		Termostato geladeira = new Termostato();
		Termostato arCondicionado = new Termostato();
		
		fogao.tempAtual = 25; // Seria lida por um sensor
		fogao.tempMin = 120;
		fogao.tempMax = 300;

		try {
			fogao.setTempDesejada(18000);
			
		}catch(IllegalArgumentException eTempInvalida) {
			System.out.println(eTempInvalida.getMessage());
		}
	}
	

}
