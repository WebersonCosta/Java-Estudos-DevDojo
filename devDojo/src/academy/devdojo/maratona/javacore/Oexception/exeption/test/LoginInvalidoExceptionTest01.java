package academy.devdojo.maratona.javacore.Oexception.exeption.test;

import java.util.Scanner;

import academy.devdojo.maratona.javacore.Oexception.exeption.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {

	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void logar() throws LoginInvalidoException{
		Scanner scan = new Scanner(System.in);
		String usernameDB = "Goku";
		String senhaDB  = "ssj";
		System.out.println("Usuario ");
		String usernameDigitado = scan.nextLine();
		System.out.println("Senha ");
		String senhaDigitada = scan.nextLine();
		if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
			 throw new LoginInvalidoException("Usuario ou senha invalidos ");
		}
		
		System.out.println("Usuario logado com sucesso ");
	}
}
