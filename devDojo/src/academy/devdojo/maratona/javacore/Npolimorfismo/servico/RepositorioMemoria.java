package academy.devdojo.maratona.javacore.Npolimorfismo.servico;

import academy.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria  implements Repositorio{

	@Override
	public void salvar() {
		System.out.println("Salvando em memoria");
	}

}
