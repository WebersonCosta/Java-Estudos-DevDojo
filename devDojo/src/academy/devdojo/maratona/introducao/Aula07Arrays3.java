package academy.devdojo.maratona.introducao;

public class Aula07Arrays3 {

	public static void main(String[] args) {
		int[] numeros = { 5 };
		int[] numeros1 = { 1, 2, 3, 4, 5 };
		int[] numeros2 = new int[]{1,2,3,4,5,6,7,8,9,10};

		// System.out.println(numeros1[3]);
		/*for (int i = 0; i < numeros1.length; i++) {
			System.out.println(numeros1[i]);
		}*/
		for (int i : numeros2) {
			System.out.println(numeros2[i]);
		}
	}
}
