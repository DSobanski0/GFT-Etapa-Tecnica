package br.com.gft.start.exercicio1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Caixa {
	
	public static String calcularTotal(ArrayList<Produto> produtos) {
		DecimalFormat df = new DecimalFormat(".00");
		double valorProduto = 0;
		for(Produto p : produtos) {
			valorProduto += p.calcularValorFinal();
		}
		return df.format(valorProduto);
	}
}
