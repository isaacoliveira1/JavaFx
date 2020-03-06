package ifr.br.heranca;

public class Gerente extends Funcionario {
		private int numFunc;
		private String senha;
		
		public Gerente(String nome, String cpf, double salario, int numFunc, String senha) {
			super(nome, cpf, salario);
			this.numFunc = numFunc;
			this.senha = senha;
		}
	
		@Override
		public double getBonificacao() {
			return (super.salario * 0.1) + 1000;
		}
	
}
