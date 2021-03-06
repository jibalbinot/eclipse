/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot Classe concreta para representar uma ContaPoupanša
 */
public class ContaPoupanca extends Conta {

	@Override
	public String getTipo() {
		return "Conta Poupanša";
	}

	@Override
	public double getRendimento() {
		return this.getSaldo() * 0.20;//Poupanša tem rendimento de 20%
	}

}
