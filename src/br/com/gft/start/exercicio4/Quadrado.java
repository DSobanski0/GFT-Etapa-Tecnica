package br.com.gft.start.exercicio4;

public class Quadrado implements AreaCalculavel{
	private Double lado;

	public Quadrado(Double lado) {
		this.lado = lado;
	}

	@Override
	public Double calculaArea() {
		return Math.pow(lado, 2);
	}
}
