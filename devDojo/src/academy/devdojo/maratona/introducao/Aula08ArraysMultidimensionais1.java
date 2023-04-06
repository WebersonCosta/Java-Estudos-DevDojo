package academy.devdojo.maratona.introducao;

public class Aula08ArraysMultidimensionais1 {

	public static void main(String[] args) {
		int[][] dias = new int[3][3];
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;

		dias[1][0] = 30;
		dias[1][1] = 31;
		dias[1][2] = 30;
		
		dias[2][0] = 31;
		dias[2][1] = 30;
		dias[2][2] = 31;

		for (int i = 0; i < dias.length; i++) {
			System.out.println("trimestre "+(i+1));
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
		}
		
		System.out.println("------------------------");
		
		
		for (int[] arrayBase : dias) {
			System.out.println("Trimestre ");
			for (int num : arrayBase) {
				System.out.println(num);
			}
		}
	}

}
