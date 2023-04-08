package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {

	public static void main(String[] args) {
		
		Repositorio repositorio = new RepositorioMemoria();
		repositorio.salvar();
		List<String> lista = new ArrayList<>();
		lista.add("Goku");
		lista.add("Vegeta");
		lista.add("Kuririn");
		System.out.println(lista);
	}

}
