package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.ex.Estudante;
import academy.devdojo.maratona.javacore.Gassociacao.ex.Local;
import academy.devdojo.maratona.javacore.Gassociacao.ex.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.ex.Seminario;

public class AssociacaoTest {

	public static void main(String[] args) {
		Local local = new Local("Rua da Larangeiras");
		Estudante estudante = new Estudante("Joaozinho",14);
		Professor professor = new Professor("Arthur","Matematica");
		
		Estudante[] alunosParaSeminario = {estudante};

		Seminario seminario = new Seminario("Logaritmos e Propriedades", alunosParaSeminario, local);
		
		Seminario[] seminariosDisponiveis = {seminario};

		professor.setSeminarios(seminariosDisponiveis);
		
		professor.imprime();
	}

}
