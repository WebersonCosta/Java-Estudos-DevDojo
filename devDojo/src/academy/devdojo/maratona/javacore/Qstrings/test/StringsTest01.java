package academy.devdojo.maratona.javacore.Qstrings.test;

public class StringsTest01 {

	public static void main(String[] args) {
		String nome = "Weberson";  // String constant pool
		String nome2 = "Weberson";
		nome = nome.concat(" Costa");
		System.out.println(nome);
		System.out.println(nome == nome2);
		
		String nome3 = new String("Weberson");
		System.out.println(nome2 == nome3);
		System.out.println(nome2 == nome3.intern());
		
	}

}
