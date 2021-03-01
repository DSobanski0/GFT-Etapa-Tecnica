package br.com.gft.start.exercicio1;

import java.util.ArrayList;

public class Caixa {
	
	public static Double calcularTotal(Produto produtos) {
		return produtos.getValor() * produtos.getQuantidade();
	}

}
