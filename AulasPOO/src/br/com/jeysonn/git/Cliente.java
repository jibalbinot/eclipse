package br.com.jeysonn.git;

public class Cliente {
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();// transforma em maiusculas
	}

	public String getNome() {
		return this.nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		String dados ="";
		dados += " Nome......: "+this.getNome()+"\n";
		dados += " CPF.......: "+this.getCpf()+"\n";
		dados += " Endere�o..: "+this.getEndereco()+"\n";
		dados += " Idade.....: "+this.getIdade();
		return dados;
	}
	
}
