package academy.devdojo.maratona.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{

	public static final double IMPOSTO_POR_CENTO = 0.21;
	public Televisao(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcualarImposto() {
		System.out.println("Calculando imposto da televisao");
		return valor * IMPOSTO_POR_CENTO;
	}

}
