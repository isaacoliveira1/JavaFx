package exercise.poli.ifpr;

public class LivroFisico extends Livro {

	public LivroFisico(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}
	public double getTaxa() {
		return this.getValor() * 0.05;
	}

	public boolean aplicDesc(double por) {
		if (por > 0.3) {
		return false;
		}
		double desconto = getValor() * por;
		setValor(getValor() - desconto);
		return true;
	}
	@Override
	public String toString() {
		return "Livro Físico" + "\nNome: " + super.getNome() + "\nDescrição: " + super.getDesc() + "\nISBN: "+ super.getIsbn() + "\nValor: " + super.getValor() + "\nAutor: " + super.autor;
	}

}
