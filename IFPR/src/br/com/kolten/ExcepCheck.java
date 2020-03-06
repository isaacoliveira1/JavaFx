package br.com.kolten;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ExcepCheck extends TermostatoFabrica {

	public static void main(String[] args) {
		BufferedReader read;
		try {
		read = new BufferedReader(new FileReader("input.txt"));
		String linha = read.readLine();

		System.out.println(linha);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
