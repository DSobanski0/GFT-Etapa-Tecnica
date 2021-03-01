package br.com.gft.start.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite outro numero: ");
		int numero2 = scan.nextInt();
		
		while(numero2 > numero1 + 15) {
			System.out.println("Intervalo invalido: o intervalo nao pode ser maior que 15");
			System.out.print("Digite outro numero: ");
			numero2 = scan.nextInt();
		}
		
		for(int i = numero1; i <= numero2; i++) {
			int resultado = (int) Math.pow(i, 3);
			System.out.printf("A raiz cubica de %s é %s\n", i, resultado);
		}
	}
}
