package academy.devdojo.maratona.introducao;

import java.util.Scanner;
import java.util.Locale;

public class Aula05EstruturasCondicionais4 {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double salarioAnual = 70000;
		double primeiraFaixa = 9.7 / 100;
		double segundaFaixa = 37.35 / 100;
		double terceiraFaixa = 49.50 / 100;
		
		double valorImposto;
		
		if(salarioAnual <= 34712) {
			valorImposto = salarioAnual * primeiraFaixa;
		}else if(salarioAnual >= 34713 && salarioAnual <= 68507) {
			valorImposto = salarioAnual * segundaFaixa;
		}else {
			valorImposto = salarioAnual * terceiraFaixa;
		}
		System.out.println(valorImposto);
	}

}
