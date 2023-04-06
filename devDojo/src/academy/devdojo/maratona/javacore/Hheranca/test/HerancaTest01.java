package academy.devdojo.maratona.javacore.Hheranca.test;

import academy.devdojo.maratona.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco();
		Endereco endereco2 = new Endereco();
		
		Pessoa pessoa = new Pessoa("Jose");
		Funcionario funcionario = new Funcionario("Maria");
		endereco1.setCep("34579-992");
		endereco1.setRua("Rua das Laranjeiras");
		
		endereco2.setCep("12345-643");
		endereco2.setRua("Rua das Cerejeiras"); 
		
		pessoa.setCpf("978.784.348-32");
		pessoa.setEndereco(endereco1);
	
		pessoa.imprime();
		System.out.println("-------------");
		
		funcionario.setCpf("098.234.643-43");
		funcionario.setEndereco(endereco2);
		funcionario.setSalario(3000);
		
		funcionario.imprime();
		funcionario.relatorioPagamento();
	}
}
