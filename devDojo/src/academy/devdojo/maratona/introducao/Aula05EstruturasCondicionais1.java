package academy.devdojo.maratona.introducao;

import java.util.Scanner;
import java.util.Locale;

public class Aula05EstruturasCondicionais1 {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int idade = 10;
		boolean isAutorizadoComprarBebida = idade >= 18;
		
		if(isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcólica");
		}else {
			System.out.println("Não autorizado a comprar bebida alcólica");
		}

	}

}
