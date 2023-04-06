package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {

	public static void main(String[] args){
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.setNome("Argo") ;
		carro1.setModelo("Fiat"); 
		carro1.setAno(2024);
		
		carro2.setNome("Corola") ;
		carro2.setModelo("Toyota"); 
		carro2.setAno(2030);
		
		carro1.setProximoCarro(carro2);
		
		System.out.println(carro1);
		System.out.println(carro1.getProximoCarro());
		System.out.println(carro1.getProximoCarro().getProximoCarro());
	}

}
