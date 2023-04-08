package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest3 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);
		
		Tomate tomate = new Tomate("Tomate amarelo", 15);
		tomate.setDataValidade("07/05/2023");
		
		CalculadoraImposto.calcularImposto(tomate);
		System.out.println("-------------------------");
		CalculadoraImposto.calcularImposto(produto);
		
	}
}
