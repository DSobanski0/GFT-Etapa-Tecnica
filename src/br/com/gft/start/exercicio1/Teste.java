package br.com.gft.start.exercicio1;

import java.util.ArrayList;

public class Teste {
	
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Eletronico ventilador = new Eletronico("Ventilador", 320.00, 3);
		produtos.add(ventilador);
		Eletronico computador = new Eletronico("Computador", 3999.00, 2);
		produtos.add(computador);
		Movel mesa = new Movel("Mesa", 270.00, 2);
		produtos.add(mesa);
		Produto caderno = new Produto("Caderno", 10.50, 10);
		produtos.add(caderno);
		Movel cadeira = new Movel("Cadeira", 234.25, 2);
		produtos.add(cadeira);
		Produto caneta = new Produto("Caneta", 0.70, 15);
		produtos.add(caneta);
		
		String total = Caixa.calcularTotal(produtos);
		System.out.println(produtos);
		System.out.printf("O valor total foi de R$%s", total);
	}
}
