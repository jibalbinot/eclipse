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

        //c1.titular = "Hugo";
		Cliente cli1 = new Cliente();
		//cli1.nome = "Hugo";um atributo private não pode ser alterado diretamente
		cli1.setNome("Hugo");//atribui um valor para nome
		System.out.println("Nome: "+cli1.getNome());//le o atributo nome
		
        //c1.numero = 123;
		c1.setNumero(123);
        //c1.agencia = "45678-9";
		c1.setAgencia("45678-9");
        //c1.saldo = 50.0; um atributo private não pode ser alterado diretamente
        //c1.dataDeAbertura = "12/08/2020";
        //Data d1 = new Data();//criação do objeto
        //c1.dataDeAbertura = d1;//ligação da data com a conta
		c1.getDataDeAbertura().setDia(12);
        c1.getDataDeAbertura().setMes(8);
        c1.getDataDeAbertura().setAno(2020);
                
        System.out.println(c1.recuperaDadosParaImpressao());

        c1.deposita(100.0);
        
        System.out.println("Antes");
        System.out.println(c1.recuperaDadosParaImpressao());
        
        Conta c2 = new Conta();
        //c2.titular = "Alberto";
        c2.setNumero(456);
        c2.setAgencia("45678-9");
        
        //c2.dataDeAbertura.dia = 17;
        c2.getDataDeAbertura().setDia(19);
        c2.getDataDeAbertura().setMes(8);
        c2.getDataDeAbertura().setAno(2020);
        
        System.out.println(c2.recuperaDadosParaImpressao());
        
        if(c1.transfere(70, c2)) {
        	System.out.println("Tranferencia realizada com sucesso");
        } else {
        	System.out.println("Operação não autorizada");
        }
        
        System.out.println("Depois");
        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println(c2.recuperaDadosParaImpressao());   

	}

}
