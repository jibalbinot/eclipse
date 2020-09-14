package br.com.jeysonn.git;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		String dados = "";
		dados += "Nome...: " + this.getNome() + "\n";
		dados += "CPF....: " + this.getCpf() + "\n";
		dados += "Salário: " + this.getSalario() + "\n";
		dados += "Bonific: " + this.getBonificacao() + "\n";
		dados += "Vencim.: " + this.getVencimento() + "\n";
		return dados;
	}
	
	public double getVencimento() {
		return this.getSalario() + this.getBonificacao();
	}
	
	public double getBonificacao() {
        return this.getSalario() * 0.10;
    }

	
}
