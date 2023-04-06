package academy.devdojo.maratona.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratona.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.maratona.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
	
	public static void main(String[] args) {
		Estudante estudante1 = new Estudante();
		Estudante estudante2 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		
		estudante1.nome = "Midoriya";
		estudante1.idade = 15;
		estudante1.sexo = 'M';
		
		estudante2.nome = "Sakura";
		estudante2.idade = 16;
		estudante2.sexo = 'F';
		
		impressora.imprimir(estudante1);
		impressora.imprimir(estudante2);
	}
		
}
	
