package academy.devdojo.maratona.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratona.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int[] numeros = {1,2,3,4,5};
		calculadora.somarArray(numeros);
		calculadora.somarVarArray(1,2,3,4,5);
		
	}
	
}
