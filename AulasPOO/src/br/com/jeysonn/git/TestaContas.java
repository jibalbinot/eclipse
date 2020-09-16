/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot
 * Classe para testar os diferentes tipos de conta
 */
public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Foi criado um objeto Cliente cli que � titular das 3 contas
		 * c  -> Conta
		 * cp -> ContaPoupanca
		 * cc -> ContaCorrente
		 * O m�todo getTipo() foi escrito e reescrito nas Contas
		 * Foi alterado o m�todo recuperaDadosParaImpressao para mostrar tamb�m o tipo
		 * Foi mostrado os dados das contas na tela usando o recuperaDadosParaImpressao
		 */
		
		Cliente cli = new Cliente("Jeysonn","Alto da XV","12345678910",39);
				
		//Conta c = new Conta(cli);//n�o premite criar um objeto do tipo Conta
		//System.out.println(c.recuperaDadosParaImpressao());
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setTitular(cli);
		cp.deposita(100);
		System.out.println(cp.recuperaDadosParaImpressao());
		
		ContaCorrente cc = new ContaCorrente(cli);
		cc.deposita(100);
		System.out.println(cc.recuperaDadosParaImpressao());
		

	}

}
