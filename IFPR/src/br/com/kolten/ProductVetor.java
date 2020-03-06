package br.com.kolten;

import javax.swing.JOptionPane;

public class ProductVetor {
	
	public static void main(String[] args) {
		Product estoque[] = new Product[10];

		
		for (int i = 0; i<estoque.length-9; i++) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: "));
			String desc = JOptionPane.showInputDialog("Digite a descrição");
			int est = Integer.parseInt(JOptionPane.showInputDialog("Digite o estoque: "));
			double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
			estoque[0] = new Product();
			estoque[0].setId(id);
			estoque[0].setDesc(desc);
			estoque[0].setEstoque(est);
			estoque[0].setPreco(preco);
			System.out.println(estoque[0]);
				
		}
	}
}
 