package exercise.poli.ifpr;

public class CarrinhoDeCompras {
	private double total;

	public void adiciona(Livro livro) {
		 this.total += livro.getValor();
	}
	public double getTotal() {
		return this.total;
	}
	
}
