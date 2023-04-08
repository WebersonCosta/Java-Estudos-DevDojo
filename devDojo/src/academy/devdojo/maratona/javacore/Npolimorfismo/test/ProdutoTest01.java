package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

	public static void main(String[] args) {
		Computador computador = new Computador("NUC1017", 11000);
		Tomate tomate = new Tomate("Tomate vermelho", 10);
		Televisao tv = new Televisao("Samsung 50\" ", 50000);
		
		CalculadoraImposto.calcularImposto(computador);
		System.out.println("------------------------------");
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("------------------------------");
		CalculadoraImposto.calcularImposto(tv);
	}

}
