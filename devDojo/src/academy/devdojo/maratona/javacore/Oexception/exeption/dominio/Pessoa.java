package academy.devdojo.maratona.javacore.Oexception.exeption.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

	public void salvar() throws LoginInvalidoException, FileNotFoundException {
		System.out.println("Salvando pessoa");
	}
}
