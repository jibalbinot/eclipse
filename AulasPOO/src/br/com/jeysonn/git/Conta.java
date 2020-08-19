package br.com.jeysonn.git;

/*
 * Ela deve ter o nome do titular (String)
 * o n�mero (int)
 * a ag�ncia (String)
 * o saldo (double)
 * uma data de abertura (String).
 * A classe Conta deve conter pelo menos os seguintes m�todos:
 * saca que recebe um valor como par�metro e retira esse valor do saldo da conta
 * deposita que recebe um valor como par�metro e adiciona esse valor ao saldo da conta
 * calculaRendimento que n�o recebe par�metro algum e devolve o valor do saldo multiplicado por 0.1
 * m�todo recuperaDadosParaImpressao(), que n�o recebe par�metro mas devolve o texto com todas as informa��es da nossa conta para efetuarmos a impress�o.
 */

public class Conta {
	private int numero;
	private String agencia;
	private Cliente titular;
	private double saldo = 0;
	private Data dataDeAbertura = new Data();

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataDeAbertura() {
		return this.dataDeAbertura;
	}
	
	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			destino.setSaldo(destino.getSaldo() + valor);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		} else {
			return false;
		}
	}

	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public double calculaRendimento() {
		return this.getSaldo() * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "";

		dados += "Ag�ncia....: " + this.agencia + "\n";
		dados += "N�mero.....: " + this.numero + "\n";
		dados += "Titular....: " + this.titular + "\n";
		dados += "Data abert.: " + this.dataDeAbertura.formatada()+ "\n";
		dados += "Saldo......: " + this.getSaldo() + "\n";
		dados += "Rendimento.: " + this.calculaRendimento() + "\n";

		return dados;
	}
	
}
