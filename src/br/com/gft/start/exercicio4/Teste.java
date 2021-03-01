package br.com.gft.start.exercicio4;

import java.text.DecimalFormat;

public class Teste {
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat(".00");
		
		Quadrado quadrado = new Quadrado(5.5);
		System.out.println("A area do quadrado é " + df.format(quadrado.calculaArea()));
		
		Retangulo retangulo = new Retangulo(3.3, 5.6);
		System.out.println("A area do retangulo é " + df.format(retangulo.calculaArea()));
		
		Circulo circulo = new Circulo(2.2);
		System.out.println("A area do circulo é " + df.format(circulo.calculaArea()));
	}
}
