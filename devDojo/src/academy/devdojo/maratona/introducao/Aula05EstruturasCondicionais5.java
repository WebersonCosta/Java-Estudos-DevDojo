package academy.devdojo.maratona.introducao;

import java.util.Scanner;
import java.util.Locale;

public class Aula05EstruturasCondicionais5 {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		byte dia = 5;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terca");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Opção invalida");
		}

		char sexo = 'M';
		switch (sexo) {
		case 'M':
			System.out.println("Homem");
			break;
		case 'F':
			System.out.println("Mulher");
			break;
		default:
			System.out.println("Invalido");
		}
	}

}
