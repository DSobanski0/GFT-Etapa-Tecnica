package br.com.gft.start.exercicio2;

public class Exercicio2 {
	
	public static void main(String[] args) {
		for(int i = 10; i <= 215; i++) {
			if(i % 3 == 0 && i % 7 == 0) {
				System.out.printf("%s é divisivel por 3 e por 7 \n", i);
			}
		}
	}
}
