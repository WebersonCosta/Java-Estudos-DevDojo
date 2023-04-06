package academy.devdojo.maratona.javacore.Kenum.test;

import academy.devdojo.maratona.javacore.Kenum.dominio.Cliente;  
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratona.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Akabayashi", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
	}

}
