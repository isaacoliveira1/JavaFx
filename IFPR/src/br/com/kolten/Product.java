package br.com.kolten;

public class Product {
	// 1 - Attributes
	private int id;
	private String desc;
	private int estoque;
	private double preco;
	// 2 - Methods constructor's
	
	public Product(int id, String desc, int estoque, double preco) {
		id = this.id;
		desc = this.desc;
		estoque = this.estoque;
		preco = this.preco;
	}
	
	
	// 3 - Others methods
	
	public Product() {
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "== Arroz Gladiador ==\nID: " + id + "\nDescrição: " + desc + "\nEstoque: " + estoque + "\nPreco: " + preco;

	}

	
	

}
