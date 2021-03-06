package exercise.poli.ifpr;


public abstract class Livro {
	private String nome,desc,isbn;
	private double valor;
	protected Autor autor;
	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "";
	}
	abstract public boolean aplicDesc(double por);
	public void mostrarDetalhes() {
		System.out.println("Nome: "+ nome);
		System.out.println("Descri��o: "+ desc);
		System.out.println("Valor: "+ valor);
		System.out.println("ISBN: "+ isbn);
		if (this.temAutor()) {
			autor.mostraDetalhes();
		}
	}
	boolean temAutor() {
		return this.autor != null;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
}
