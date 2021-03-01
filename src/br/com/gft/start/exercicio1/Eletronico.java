package br.com.gft.start.exercicio1;

public class Eletronico extends Produto{
	
	
	public Eletronico(String nome, Double valor, Integer quantidade) {
		super(nome, valor, quantidade);
	}

	@Override
	public Double calcularValorFinal() {
		return getValor() * getQuantidade() * 1.15;
	}

}
