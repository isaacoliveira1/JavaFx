package ifr.br.heranca;

public class Dados extends Pessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa("Pedro", "Rua Dois", "0000-0000", "pedro@gmail.com");
		Cliente pessoa1 = new Cliente("Antoniete", "Rua Antares", "0000-0000", "antoni@gmail.com", "11-214.444-3","111.134.111-93");
		Fornecedor pessoa2 = new Fornecedor("C&A", "Rua aquario", "0000-0000", "c&a@gmail.com", "14567123467444-3","142311324-93");
		System.out.println("Pessoa: \n"+pessoa);
		System.out.println("Cliente: \n"+pessoa1);
		System.out.println("Fornecedor: \n"+ pessoa2);
		
		Pessoa vetPessoas[] = new Pessoa[1000];
		vetPessoas[0] = new Cliente();
		vetPessoas[1] = new Fornecedor();
		
		
		for (int i=0; i<vetPessoas.length; i++) {
			System.out.println(vetPessoas[i]);
		}
	}

}
