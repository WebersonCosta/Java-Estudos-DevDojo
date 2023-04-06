package academy.devdojo.maratona.javacore.Gassociacao.ex;

public class Seminario {
	private String titulo;
	private Local local;;
	private Estudante[] estudantes;
	

	public Seminario(String titulo, Local local) {
		this.titulo = titulo;
		this.local = local;
	}

	public Seminario(String titulo, Estudante[] estudantes, Local local) {
		this.titulo = titulo;
		this.estudantes = estudantes;
		this.local = local;
	}

	public Local getLocal() {
		return local;
	}
	
	public void setLocal(Local local) {
		this.local = local;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}
	
}
