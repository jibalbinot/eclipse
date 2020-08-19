package br.com.jeysonn.git;

/*
 * Ela deve ter o nome do titular (String)
 * o número (int)
 * a agência (String)
 * o saldo (double)
 * uma data de abertura (String).
 * A classe Conta deve conter pelo menos os seguintes métodos:
 * saca que recebe um valor como parâmetro e retira esse valor do saldo da conta
 * deposita que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta
 * calculaRendimento que não recebe parâmetro algum e devolve o valor do saldo multiplicado por 0.1
 * método recuperaDadosParaImpressao(), que não recebe parâmetro mas devolve o texto com todas as informações da nossa conta para efetuarmos a impressão.
 */

public class Conta {
	private int numero;
	private String agencia;
	private Cliente titular;
	private double saldo = 0;
	private Data dataDeAbertura = new Data();
	
	//construtores
	Conta(){
		System.out.println("1 executou o construtor sem argumento");
	}
	
	Conta(int numero){
		System.out.println("2 executou o construtor com argumento numero");
		this.numero = numero;
	}
	
	Conta(int numero, String agencia){
		this(numero);//é possível um construtor chamar outro desde que seja o primeiro comando
		System.out.println("3 executou o construtor com argumento numero e agencia");
		this.agencia = agencia;
	}

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

		dados += "Agência....: " + this.agencia + "\n";
		dados += "Número.....: " + this.numero + "\n";
		dados += "Titular      " + "\n"+this.titular.toString() + "\n";
		dados += "Data abert.: " + this.dataDeAbertura.formatada()+ "\n";
		dados += "Saldo......: " + this.getSaldo() + "\n";
		dados += "Rendimento.: " + this.calculaRendimento() + "\n";

		return dados;
	}
	
}
