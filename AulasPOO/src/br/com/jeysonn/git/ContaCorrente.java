/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot Classe concreta para representar uma Conta Corrent
 */
public class ContaCorrente extends Conta {
	
	ContaCorrente(String agencia){
		super(agencia);//chama o construtor da classe mãe (superclasse)
	}
	
	ContaCorrente(Cliente titular){
		super(titular);//chama o construtor da classe mãe (superclasse)
	}
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getRendimento() {
		return this.getSaldo() * 0.10;//Conta Corrente tem rendimento de 10%
	}
	

	
}
