package academy.devdojo.maratona.javacore.Oexception.exeption.dominio;

public class LoginInvalidoException extends Exception {
	
	public LoginInvalidoException() {
		super("Login invalido");
	}
	
	public LoginInvalidoException(String message) {
		super(message);
	}
}
