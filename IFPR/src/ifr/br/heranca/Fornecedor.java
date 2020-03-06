package ifr.br.heranca;

public class Fornecedor extends Pessoa {
	private String cnpj;
	private String ie;
	
	public Fornecedor() {
		super();
	}
	public Fornecedor(String nome, String endereco, String fone, String email, String cnpj, String ie) {
		super(nome, endereco, fone, email);
		this.cnpj = cnpj;
		this.ie = ie;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	@Override
	public String toString() {
		return super.toString() + "Fornecedor\nCNPJ: " + cnpj + "\nInscrição Estadual: " + ie;
	}
	
	
	
}
