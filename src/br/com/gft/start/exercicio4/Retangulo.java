package br.com.gft.start.exercicio4;

public class Retangulo implements AreaCalculavel{

	private Double largura;
	private Double altura;
	
	public Retangulo(Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public Double calculaArea() {
		return largura * altura;
	}
	
	
}
