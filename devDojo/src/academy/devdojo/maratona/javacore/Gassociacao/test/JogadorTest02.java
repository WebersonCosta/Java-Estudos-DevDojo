package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Pele");
		Time time = new Time("Selecao Brasileira");
		
		jogador1.setTime(time);
		jogador1.imprime();
		
	}
}
