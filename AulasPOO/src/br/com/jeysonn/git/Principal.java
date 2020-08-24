/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot
 * Exemplo de integra��o do Eclipse como GitHub
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta c1 = new Conta(123, "45678-9", 0);
        //c1.titular = "Hugo";
		
		Cliente cli1 = new Cliente("Hugo","123.456.789-10","Marechal Deodoro, 1000",30);
		
		//cli1.nome = "Hugo";um atributo private n�o pode ser alterado diretamente
		cli1.setNome("Hugo");//atribui um valor para nome
		cli1.setCpf("123.456.789-10");
		cli1.setEndereco("Marechal Deodoro, 1000");
		cli1.setIdade(30);
		c1.setTitular(cli1);//liga��o da Conta c1 com o Cliente cli1
				
        //c1.numero = 123;
		c1.setNumero(123);
        //c1.agencia = "45678-9";
		c1.setAgencia("45678-9");
        //c1.saldo = 50.0; um atributo private n�o pode ser alterado diretamente
        //c1.dataDeAbertura = "12/08/2020";
        //Data d1 = new Data();//cria��o do objeto
        //c1.dataDeAbertura = d1;//liga��o da data com a conta
		c1.getDataDeAbertura().setDia(12);
        c1.getDataDeAbertura().setMes(8);
        c1.getDataDeAbertura().setAno(2020);
              
        System.out.println(c1.recuperaDadosParaImpressao());

        c1.deposita(100.0);
        
        System.out.println("Antes");
        System.out.println(c1.recuperaDadosParaImpressao());
        
        Conta c2 = new Conta(456,"45678-9");
        //c2.titular = "Alberto";
        c2.setNumero(456);
        c2.setAgencia("45678-9");
        
        //c2.dataDeAbertura.dia = 17;
        //c2.getDataDeAbertura().setDia(19);
        //c2.getDataDeAbertura().setMes(8);
        //c2.getDataDeAbertura().setAno(2020);
        
        c2.setTitular(new Cliente());
        c2.getTitular().setNome("Ze Maria");
        c2.getTitular().setEndereco("XV de Novembro, 999");
        c2.getTitular().setCpf("987.654.321-10");
        c2.getTitular().setIdade(25);
                
        System.out.println(c2.recuperaDadosParaImpressao());
        
        if(c1.transfere(70, c2)) {
        	System.out.println("Tranferencia realizada com sucesso");
        } else {
        	System.out.println("Opera��o n�o autorizada");
        }
        
        System.out.println("Depois");
        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println(c2.recuperaDadosParaImpressao());   

	}

}
