package ifr.br.heranca;

public class ActionBonificacao {

	public static void main(String[] args) {

		ControleBonificacao controle = new ControleBonificacao();
		Funcionario f1 = new Funcionario("Maria", "111.111.222-84", 4200);
		Gerente g1 = new Gerente("Andreia", "888-444-333-92", 15000, 12, "fghjas");
		
		controle.regFunc(f1);
		controle.regFunc(g1);
		System.out.println("Bonificações: " + controle.getTotalBoni());
	}

}
