package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest2 {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();

		estudante.nome = "Jose";
		estudante.idade = 18;
		estudante.sexo = 'M';
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);

	}

}
