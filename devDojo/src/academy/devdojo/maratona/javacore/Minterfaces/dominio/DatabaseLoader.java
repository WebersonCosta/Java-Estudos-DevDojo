package academy.devdojo.maratona.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader , DataRemover{

	@Override
	public void load() {
		System.out.println("Carregando dados do banco de dados");
	}

	@Override
	public void remove() {
		System.out.println("Removendo dados do banco de dados");
		
	}
	
	@Override
	public void checkPermission() {
		System.out.println("Checando permisoes no banco de dados");
	}
}
