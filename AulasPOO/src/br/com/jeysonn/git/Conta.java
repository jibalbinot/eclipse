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
	//atributos de objeto
	private int numero;
	private String agencia;
	private Cliente titular;
	private double saldo = 0;
	private Data dataDeAbertura = new Data();
	
	//atributo de classe (static) regi�o compartilhada por todos os objetos do tipo Conta
	static private int totalDeContas = 0;
	
	//metodo static para recurperar/ler o atributo de classe
	public static int getTotalDeContas() {
		return totalDeContas;
	}

	//construtores
	public Conta(){
		Conta.totalDeContas++;//atributo de classe
		this.numero = Conta.totalDeContas;
		System.out.println("1 executou o construtor sem argumento");
	}
	
	public Conta(Cliente titular) {
		this();
		this.titular = titular;
	}
	
	public Conta(String agencia){
		this();//� poss�vel um construtor chamar outro desde que seja o primeiro comando
		this.agencia = agencia;
		System.out.println("3 executou o construtor com argumento numero e agencia");		
	}
	
	public Conta(String agencia, double saldo){
		this(agencia);
		this.saldo = saldo;
		System.out.println("4 executou o construtor com argumento numero, agencia e saldo");
	}

	public int getNumero() {
		return this.numero;
	}
	
	/*
	 * Retiramos o m�todo setNumero
	 * pois a conta recebe um n�mero
	 * sequencial gerado automaticamente
	 * usando como referencia um atributo
	 * de classe totalDeContas
	 *
	public void setNumero(int numero) {
		this.numero = numero;
	}
	*/
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

	public double getRendimento() {
		return this.getSaldo() * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "";

		dados += "Ag�ncia....: " + this.agencia + "\n";
		dados += "N�mero.....: " + this.numero + "\n";
		dados += "Titular      " + "\n"+this.titular.toString() + "\n";
		dados += "Data abert.: " + this.dataDeAbertura.formatada()+ "\n";
		dados += "Saldo......: " + this.getSaldo() + "\n";
		dados += "Rendimento.: " + this.getRendimento() + "\n";

		return dados;
	}
	
}
