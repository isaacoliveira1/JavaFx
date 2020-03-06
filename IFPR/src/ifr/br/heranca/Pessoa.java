package ifr.br.heranca;

public class Pessoa {
	private String nome;
	private String endereco;
	private String fone;
	private String email;
	
	
	
	public Pessoa() {
		super();
	}
	
	
	public Pessoa(String nome, String endereco, String fone, String email) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.fone = fone;
		this.email = email;
	}





	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFone() {
		return fone;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + fone + "\nEmail: " + email;
	}
	
	

}
