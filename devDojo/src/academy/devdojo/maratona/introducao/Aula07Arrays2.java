package academy.devdojo.maratona.introducao;

public class Aula07Arrays2 {

	public static void main(String[] args) {
		// byte, short, long, float, double = 0
		// char '\u0000' ' '
		// boolean false
		// String null
		
		String[] nomes = new String[3];
		
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "José";
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
	}

}