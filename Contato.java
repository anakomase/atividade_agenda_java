package atividade_array_telefone;

public class Contato {

	private String nome;
	private String fone;
	private int posicao;
	private String contato;
	
	public Contato(String nome, String fone)
	{
		this.nome = nome;
		this.fone = fone;
	}

	public String getNome() {
		return nome;
	}
	
	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	public String getFone() {
		return fone;
	}
	
	public String setFone(String fone) {
		return this.fone = fone;
	}
	
	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
	public String toString() {
		return String.format("Nome: %s, Fone: %s\n", this.nome, this.fone);
	}	
}
