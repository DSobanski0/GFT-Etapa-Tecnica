package br.com.gft.start.exercicio1;

public class Movel extends Produto{

	public Movel(String nome, Double valor, Integer quantidade) {
		super(nome, valor, quantidade);
	}

	@Override
	public Double calcularValorFinal() {
		if(getQuantidade() < 10) {
			return getValor() * getQuantidade() * 1.11;
		} else {
			return getValor() * getQuantidade() * 1.05;
		}
	}
}
