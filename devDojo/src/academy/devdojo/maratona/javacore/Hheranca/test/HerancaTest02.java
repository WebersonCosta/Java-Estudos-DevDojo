package academy.devdojo.maratona.javacore.Hheranca.test;

import academy.devdojo.maratona.javacore.Hheranca.dominio.Funcionario;
;

public class HerancaTest02 {
	//0 - Bloco de inicialização estatico da superclasse é executado quando a JVM carregar classe pai
	//1 - Bloco de inicializaçao estatico da subclasse é executado quando a JVM carregar classe filha
	//2 - Alocado espaço em memório para objeto da superclasse
	//3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
	//4 - Bloco de inicialização da superclasse é executado na ordem em que aparecem
	//5 - Construtor da superclasse é executado
	//6 - Alocado espaço em memório para objeto da subclasse
	//7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
	//8 - Bloco de inicialização da subclasse é executado na ordem em que aparecem
	//9 - Construtor da subclasse é executado
	public static void main(String[] args) {
	
		Funcionario funcionario = new Funcionario("Jiráya");

	}
}
