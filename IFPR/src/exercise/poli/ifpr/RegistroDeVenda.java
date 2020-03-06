package exercise.poli.ifpr;

public class RegistroDeVenda {
	public static void main (String[] args) {
		Autor a = new Autor();
		a.setNome("Antonio");
		a.setEmail("antonio.ekie@edu.br");
		a.setCpf("444.333.222-11");
		Autor a1 = new Autor();
		a1.setNome("Kent");
		a1.setEmail("kent-volks@edu.br");
		a1.setCpf("333.222.111-23");
		LivroFisico fisico = new LivroFisico(null);
		fisico.setAutor(a);
		fisico.setNome("Estrela Cadente");
		fisico.setDesc("Referencia a estrela cadente");
		fisico.setValor(98);
		fisico.setIsbn("8412681151516-98");
		Ebook eb = new Ebook(null);
		eb.setAutor(a1);
		eb.setNome("Cometas e suas caracteristicas");
		eb.setDesc("Referencia as caracteristicas dos cometas");
		eb.setValor(43);
		eb.setIsbn("8412681151516-98");
		System.out.println("Autor");
		CarrinhoDeCompras ab = new CarrinhoDeCompras();
		ab.adiciona(fisico);
		ab.adiciona(eb);
		ab.equals(a);
		System.out.println(fisico);
		System.out.println(eb);
		System.out.println("Valor Total: " + ab.getTotal());
		
	}
}
