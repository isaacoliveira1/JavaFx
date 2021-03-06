package exercise.poli.ifpr;

public class Ebook extends Livro {
	private String watermark;
	
	public Ebook(Autor autor) {
		super(autor);
		// TODO Auto-generated constructor stub
	}

	public boolean aplicDesc(double por) {
		if (por > 0.15) {
		return false;
		}
		double desconto = getValor() * por;
		setValor(getValor() - desconto);
		return true;
	}

	public String getWatermark() {
		return watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}
	@Override
	public String toString() {
		return "Ebook"+ "\nNome: " + super.getNome() + "\nDescrição: " + super.getDesc() + "\nISBN: "+ super.getIsbn() + "\nValor: " + super.getValor() + "\nAutor: " + super.getAutor();
	}

}
