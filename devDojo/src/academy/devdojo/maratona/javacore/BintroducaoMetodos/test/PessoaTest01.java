package academy.devdojo.maratona.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratona.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jiraya");
		pessoa.setIdade(70);
		
		//pessoa.imprimir();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}
}
