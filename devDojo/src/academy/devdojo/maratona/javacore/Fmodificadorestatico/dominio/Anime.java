package academy.devdojo.maratona.javacore.Fmodificadorestatico.dominio;

import java.util.Iterator;

public class Anime {
	private String nome;
	private static int[] episodios;
	
	static{
		System.out.println("Dentro do bloco de inicializacao");
		episodios = new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i] = i+1;
		}
	}
	public Anime(String nome) {
		this.nome = nome;
	}


	public Anime() {
		for (int episodio : Anime.episodios) {
			System.out.print(episodio + " ");
		}
		System.out.println();
	}

	public String getNome() {
		return nome;
	}


	public int[] getEpisodios() {
		return episodios;
	}
	
	
}
