/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot Classe para testar conceito de herança com Funcionario e
 *         Gerente
 */
public class Principal2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Jeysonn");
		f.setCpf("12345678910");
		f.setSalario(1500);
		System.out.println(f);

		Gerente g = new Gerente();
		g.setNome("Evandro");
		g.setCpf("11122233344");
		g.setSalario(2500);
		System.out.println(g);
		g.autentica(1234);

	}

}
