package academy.devdojo.maratona.javacore.Lclasseabstrata.dominio;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void calculaBonus() {
		// TODO Auto-generated method stub
		this.salario += this.salario * 0.2; 
	}
	
	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}
	
}
