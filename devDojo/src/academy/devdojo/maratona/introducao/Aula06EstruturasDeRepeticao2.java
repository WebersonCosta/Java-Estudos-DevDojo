package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao2 {

	public static void main(String[] args) {
		//Imprimir todos os mumeros pares ate 1000000
		int numero = 10000;
		for(int i=1; i<=numero; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
