package br.com.gft.start.exercicio1;

public class Produto {
	private String nome;
	private Double valor;
	private Integer quantidade;
	
	public Produto(String nome, Double valor, Integer quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double calcularValorFinal() {
		return valor * quantidade * 1.1;
	}
	
	@Override
	public String toString() {
		return String.format("\tNome: %s\n\tValor: R$%s\n\tQuantidade: %s\n", nome, valor, quantidade) ;
	}

}
