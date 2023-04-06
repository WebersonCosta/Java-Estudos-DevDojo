package academy.devdojo.maratona.javacore.Gassociacao.ex;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	public Professor(String nome) {
		this.nome = nome;
	}

	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public Professor(String nome, String especialidade, Seminario[] seminarios) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = seminarios;
	}

	public void imprime() {
		System.out.println("----------");
		System.out.println("Professor: "+this.nome);
		System.out.println("Especialidade: "+this.especialidade);
		if(seminarios == null)return;
		System.out.println("## Seminarios Cadastrados ##");
		for (Seminario seminario : seminarios) {
			System.out.println(seminario.getTitulo());
			System.out.println(seminario.getLocal().getEndereço());
			if(seminario.getLocal() == null)continue;
			System.out.println("## Alunos ##");
			for (Estudante estudante : seminario.getEstudantes()) {
				System.out.print(estudante.getNome()+ ", ");
				System.out.println(estudante.getIdade()+ " anos");
			}
		}
	}
	
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
