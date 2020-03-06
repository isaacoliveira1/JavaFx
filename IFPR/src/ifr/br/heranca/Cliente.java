package ifr.br.heranca;

public class Cliente extends Pessoa{
	private String rg;
	private String cpf;
	
	public Cliente() {
		super();

	}

	public Cliente(String nome, String endereco, String fone, String email,String cpf, String rg) {
		super(nome, endereco, fone, email);
		this.cpf = cpf;
		this.rg = rg;
	}
		
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRG: " + rg + "\nCPF: " + cpf;
	}

	

	
	
	

}

