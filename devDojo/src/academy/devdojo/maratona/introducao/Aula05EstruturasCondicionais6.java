package academy.devdojo.maratona.introducao;

import java.util.Scanner;
import java.util.Locale;

public class Aula05EstruturasCondicionais6 {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		byte dia = 1;
		switch (dia) {
		case 1:
		case 7:
			System.out.println("FDS");
			break;
		
		case 2:
			
		case 3:
			
		case 4:
			
		case 5:
			
		case 6:
			System.out.println("Dia util");
			break;
		default:
			System.out.println("Opção invalida");
			break;
		}
		int b1 = 1;
		if(b1 * 3 > 10)
			System.out.println("sdfasdfasd");
		else
			System.out.println();
		
	}

}
