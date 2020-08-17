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
	int numero;
	String agencia;
	Cliente titular;
	private double saldo = 0;
	Data dataDeAbertura = new Data();

	public boolean transfere(double valor, Conta destino) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "";

		dados += "Ag�ncia....: " + this.agencia + "\n";
		dados += "N�mero.....: " + this.numero + "\n";
		dados += "Titular....: " + this.titular + "\n";
		dados += "Data abert.: " + this.dataDeAbertura.formatada()+ "\n";
		dados += "Saldo......: " + this.saldo + "\n";
		dados += "Rendimento.: " + this.calculaRendimento() + "\n";

		return dados;
	}
	
}
