package br.com.jeysonn.git;

public class Cliente {
	private String nome;
	String endereco;
	String cpf;
	int idade;
	
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();//transforma em maiusculas
	}
	
	public String getNome() {
		return this.nome;
	}
}
