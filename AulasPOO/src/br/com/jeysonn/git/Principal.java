/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot
 * Exemplo de integração do Eclipse como GitHub
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta c1 = new Conta();

        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        c1.dataDeAbertura = "12/08/2020";
        
        System.out.println(c1.recuperaDadosParaImpressao());

        c1.deposita(100.0);
        
        System.out.println(c1.recuperaDadosParaImpressao());
        
        System.out.println("saldo atual:" + c1.saldo);
        System.out.println("rendimento mensal:" + c1.calculaRendimento());	

	}

}
