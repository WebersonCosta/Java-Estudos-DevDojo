package academy.devdojo.maratona.javacore.Lclasseabstrata.test;

import academy.devdojo.maratona.javacore.Lclasseabstrata.dominio.Desenvolvedor;
import academy.devdojo.maratona.javacore.Lclasseabstrata.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Lclasseabstrata.dominio.Gerente;

public class FuncionarioTest01 {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Zoro", 10000);
		Funcionario desenvolvedor = new Desenvolvedor("Weberson", 20000);
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		
		desenvolvedor.imprime();
		gerente.imprime();
	}

} 
