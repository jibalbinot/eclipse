/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot Classe concreta para representar uma ContaPoupan�a
 */
public class ContaPoupanca extends Conta {

	@Override
	public String getTipo() {
		return "Conta Poupan�a";
	}

	@Override
	public double getRendimento() {
		return this.getSaldo() * 0.20;//Poupan�a tem rendimento de 20%
	}

}
