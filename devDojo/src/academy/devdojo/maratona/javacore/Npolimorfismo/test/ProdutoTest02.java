package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println("--------------------------");
		Produto produto2 = new Tomate("Tomate amarelo", 15);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
	}
}
