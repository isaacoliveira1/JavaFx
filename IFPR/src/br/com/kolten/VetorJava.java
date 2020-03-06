package br.com.kolten;

import javax.swing.JOptionPane;

public class VetorJava {

	public static void main(String[] args) {
		int idades[] = new int[10];
		double precos[] = new double[10];
		String nomes[] = new String[10];
		
		for (int i = 0; i<idades.length-1; i++) {
			idades[i] = (int) Math.floor(Math.random() * 100);
			System.out.println("Idades: " + idades[i]);
		}
		String nome;
		for (int i = 0; i<nomes.length-1; i++) {
			nome = JOptionPane.showInputDialog("Qual seu nome?");
			nomes[i]= nome;
		}
		for (int i=0; i<nomes.length-1; i++) {
		JOptionPane.showMessageDialog(null, "Nome: " + nomes[i]);
		}
		
		for (int i =0; i<precos.length-1; i++) {
			precos[i]= Math.floor(Math.random() * 100);
			JOptionPane.showMessageDialog(null, "Valor: " +precos[i]);
		}
		
	}

}
