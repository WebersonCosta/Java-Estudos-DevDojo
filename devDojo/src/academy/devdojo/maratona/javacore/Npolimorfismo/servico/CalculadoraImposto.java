package academy.devdojo.maratona.javacore.Npolimorfismo.servico;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
 
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatorio de imposto");
		double imposto = produto.calcualarImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preco: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
		if(produto instanceof Tomate) {
			Tomate tomate = (Tomate) produto;
			System.out.println(tomate.getDataValidade());
		}		
	}
}
