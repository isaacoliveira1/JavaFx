package ifr.br.heranca;

public class ControleBonificacao {
	
	private double calc;
	
	public void regFunc(Funcionario f) {
		this.calc += f.getBonificacao();
	}
	public double getTotalBoni() {
		return this.calc;
	}
	
}
