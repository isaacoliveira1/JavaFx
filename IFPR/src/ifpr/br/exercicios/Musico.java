package ifpr.br.exercicios;

public abstract class Musico {
	public abstract String getNomeDoInstrumento();
	public void afinarInsturmento() {
		System.out.println("Estou afinando o/a " + getNomeDoInstrumento());
	}
}
