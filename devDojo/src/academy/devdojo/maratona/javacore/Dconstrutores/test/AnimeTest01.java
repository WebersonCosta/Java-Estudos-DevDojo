package academy.devdojo.maratona.javacore.Dconstrutores.test;

import academy.devdojo.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
	public static void main(String[] args) {
		Anime anime = new Anime("Akuma Drive", "TV", 12, "Acao");
		//anime.setNome("Akuma Drive");
		//anime.setTipo("TV");
		//anime.setEpisodios(12);
		
		anime.imprime();
	}
}
