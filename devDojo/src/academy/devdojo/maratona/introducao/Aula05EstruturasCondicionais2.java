package academy.devdojo.maratona.introducao;

import java.util.Scanner;
import java.util.Locale;

public class Aula05EstruturasCondicionais2 {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double salario = 6000;
		String mensagemDoar = "Eu vou doar 500 para o DevDojo";
		String mensagemNaoDoar = "Ainda não tenho condiçoes, mas vou ter!";
		// (condition) ? true: false
		String resultado = salario>5000? mensagemDoar: mensagemNaoDoar;
		
		System.out.println(resultado);
	}

}
