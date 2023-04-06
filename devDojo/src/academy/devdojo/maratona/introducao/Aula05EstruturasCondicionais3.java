package academy.devdojo.maratona.introducao;

import java.util.Scanner;
import java.util.Locale;

public class Aula05EstruturasCondicionais3 {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int idade = 17;
		String categoria;
		
		if(idade < 15) {
			categoria = "Categoria infantil";
		}else if(idade >= 15 && idade < 18){
			categoria = "Categoria juvenil";
		}else {
			categoria = "Categoria adulto";
		}
		System.out.println(categoria);

	}

}
