package br.com.gft.start.exercicio4;

public class Circulo implements AreaCalculavel{

	private Double raio;
	
	
	public Circulo(Double raio) {
		this.raio = raio;
	}


	@Override
	public Double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
