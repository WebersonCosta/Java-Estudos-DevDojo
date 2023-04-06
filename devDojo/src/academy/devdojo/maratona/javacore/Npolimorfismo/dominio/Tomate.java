package academy.devdojo.maratona.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
	
	public static final double IMPOSTO_POR_CENTO = 0.06;
	public Tomate(String nome, double valor) {
		super(nome, valor);
	}
	
	@Override
	public double calcualarImposto() {
		System.out.println("Calculando imposto do tomate ");
		return valor * IMPOSTO_POR_CENTO;
	}
}
