package academy.devdojo.maratona.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double[] salarios;// = new double[3];
	private double media;

	public void imprimirDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		if (salarios == null) {
			for (double sal : salarios) {
				return;
			}
		}
		for(double salario: salarios) {
			System.out.println(salario + " ");
		}
		
		mediaSalario();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public double getMedia() {
		return media;
	}


	public void mediaSalario() {
		if (salarios == null) {
			return;
		}
		
		for (double salario : salarios) {
			media += salario;
		}
		
		media /= salarios.length;
		
		System.out.println("\nMedia salarial "+ media);
	}

}
