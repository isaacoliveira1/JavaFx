package br.com.kolten;

public class ProductTest {

	public static void main(String[] args) {

		Product arroz = new Product();
		Product feijao;
		feijao = new Product();
		arroz.setId(0001);
		arroz.setDesc("Integral");
		arroz.setEstoque(5403);
		arroz.setPreco(13.99);
		System.out.println(arroz);
	}
	
}
