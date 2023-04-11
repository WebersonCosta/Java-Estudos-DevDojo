package academy.devdojo.maratona.javacore.Oexception.exeption.test;

import academy.devdojo.maratona.javacore.Oexception.exeption.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Oexception.exeption.dominio.LoginInvalidoException;
import academy.devdojo.maratona.javacore.Oexception.exeption.dominio.Pessoa;

public class SobrescritaComExceptionTeste01 {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		
		try {
			funcionario.salvar();
		} catch (ArithmeticException | LoginInvalidoException e) {
			e.printStackTrace();
		}
	}
}
