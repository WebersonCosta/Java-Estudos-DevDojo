package academy.devdojo.maratona.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratona.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.multiplicarDoisNumeros(10, 20);
		double result = calc.dividirDoisNumeros(20, 2);
		
		System.out.println(result);
		
		int num1 = 1;
		int num2 = 2; 
		
		calc.alterarDoisNumeros(num1, num2);
		System.out.println(num1);
		System.out.println(num2);
	}
}
