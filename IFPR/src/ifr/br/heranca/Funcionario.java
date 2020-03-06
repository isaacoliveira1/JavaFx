package ifr.br.heranca;

public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	
	public double getBonificacao() {
		return salario * 0.1;
	}

	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	
	
}
