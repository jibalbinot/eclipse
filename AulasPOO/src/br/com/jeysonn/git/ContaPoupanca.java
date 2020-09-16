/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot Classe concreta para representar uma ContaPoupança
 */
public class ContaPoupanca extends Conta {

	@Override
	public String getTipo() {
		return "Conta Poupança";
	}

	@Override
	public double getRendimento() {
		return this.getSaldo() * 0.20;//Poupança tem rendimento de 20%
	}

}
