package academy.devdojo.maratona.javacore.Npolimorfismo.servico;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
	public static void calcularImpostoComputador(Computador computador) {
		System.out.println("Relatorio de imposto do computador");
		double imposto = computador.calcualarImposto();
		System.out.println("Imposto do computador "+computador.getNome());
		System.out.println("Valor "+computador.getValor());
		System.out.println("Imposto a ser pago "+imposto);
	}
	
	
	public static void calcularImpostoTomate(Tomate tomate) {
		System.out.println("Relatorio de imposto do tomate");
		double imposto = tomate.calcualarImposto();
		System.out.println("Imposto do tomate "+tomate.getNome());
		System.out.println("Valor "+tomate .getValor());
		System.out.println("Imposto a ser pago "+imposto);
	}
}
