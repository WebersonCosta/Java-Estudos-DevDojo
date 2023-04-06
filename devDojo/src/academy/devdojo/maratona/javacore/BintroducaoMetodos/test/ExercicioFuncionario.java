package academy.devdojo.maratona.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratona.javacore.BintroducaoMetodos.dominio.Funcionario;

public class ExercicioFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jose");
		funcionario.setIdade(18);
		funcionario.setSalarios(new double[]{1200, 987.32, 2000});
		
		funcionario.imprimirDados();
	}
}
