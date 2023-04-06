package academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio;

public class Carro {
	private String nome;
	private String modelo;
	private int ano;
	private Carro proximoCarro;

	public Carro() {
	}

	public Carro(String nome, String modelo, int ano) {
		this.proximoCarro = null;
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Carro getProximoCarro() {
		return proximoCarro;
	}

	public void setProximoCarro(Carro proximoCarro) {
		this.proximoCarro = proximoCarro;
	}

	@Override
	public String toString() {
		return " ---Carro---\n nome = " + nome + ",\n modelo = " + modelo + ",\n ano = " + ano;
	}

}
