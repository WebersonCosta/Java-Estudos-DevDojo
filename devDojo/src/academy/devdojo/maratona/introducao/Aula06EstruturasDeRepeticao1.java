package academy.devdojo.maratona.introducao;

public class Aula06EstruturasDeRepeticao1 {

	public static void main(String[] args) {
		int count = 0;
		while(count<=10) {
			System.out.println(count);
			count ++;
		}
		count = 0;
		
		do {
			System.out.println(count);
			count++;
		}while(count <= 10);
		
		for(int i=0; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
