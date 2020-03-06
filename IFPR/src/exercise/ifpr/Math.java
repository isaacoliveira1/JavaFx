package exercise.ifpr;

public class Math {
	private int a,b;
	
	public Math() {
		
	}
	
	public static void soma(int a, int b) {
		int result = a+b;
		System.out.println("Soma: "+result);
	}
	public static void subtracao (int a, int b) {
		int sub = a-b;
		System.out.println("Subtração: "+ sub);
	}
	public static void multiplicacao(int a, int b) {
		int mut = a*b;
		System.out.println("Multiplicação: " +mut);
	}
	
	public static void divisao(int a, int b) {
		int div = a/b;
		System.out.println("Divisão: "+ div);
	}
}
