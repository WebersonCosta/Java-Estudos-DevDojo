package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {

	public static void main(String[] args) {
		Jogador jogador1 = new Jogador("Cafu");
		Jogador jogador2 = new Jogador("Pele");
		Time time = new Time("Brasil");
		Jogador jogadores[] = {jogador1, jogador2};

		jogador1.setTime(time);
		jogador2.setTime(time);
		time.setJogadores(jogadores);
		
		System.out.println("---- jogador ---");
		jogador1.imprime();
		
		System.out.println("---- Time ---");
		time.imprime();
	}

}
