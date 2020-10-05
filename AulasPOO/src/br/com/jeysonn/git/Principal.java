/**
 * 
 */
package br.com.jeysonn.git;

/**
 * @author jibalbinot Exemplo de integração do Eclipse como GitHub
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Total: " + Conta.getTotalDeContas());

		Conta c1 = new ContaCorrente("45678-9");
		// c1.titular = "Hugo";

		System.out.println("Total c1: " + c1.getTotalDeContas());
		System.out.println("Total: " + Conta.getTotalDeContas());

		Cliente cli1 = new Cliente("Hugo", "123.456.789-10", "Marechal Deodoro, 1000", 30);

		// cli1.nome = "Hugo";um atributo private não pode ser alterado diretamente
		cli1.setNome("Hugo");// atribui um valor para nome
		cli1.setCpf("123.456.789-10");
		cli1.setEndereco("Marechal Deodoro, 1000");
		cli1.setIdade(30);
		c1.setTitular(cli1);// ligação da Conta c1 com o Cliente cli1

		// c1.numero = 123;
		// c1.setNumero(123);//gerado automaticamente
		// c1.agencia = "45678-9";
		c1.setAgencia("45678-9");
		// c1.saldo = 50.0; um atributo private não pode ser alterado diretamente
		// c1.dataDeAbertura = "12/08/2020";
		// Data d1 = new Data();//criação do objeto
		// c1.dataDeAbertura = d1;//ligação da data com a conta
		c1.getDataDeAbertura().setDia(12);
		c1.getDataDeAbertura().setMes(8);
		c1.getDataDeAbertura().setAno(2020);

		System.out.println(c1.recuperaDadosParaImpressao());

		c1.deposita(100.0);
		try {
			c1.saca(101);
			System.out.println("Sacou com sucesso");
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " +e.getMessage());
		}
		System.out.println("Antes");
		System.out.println(c1.recuperaDadosParaImpressao());

		Conta c2 = new ContaCorrente("45678-9");

		System.out.println("Total: " + Conta.getTotalDeContas());
		System.out.println("Total c1: " + c1.getTotalDeContas());

		// c2.titular = "Alberto";
		// c2.setNumero(456);
		c2.setAgencia("45678-9");

		// c2.dataDeAbertura.dia = 17;
		// c2.getDataDeAbertura().setDia(19);
		// c2.getDataDeAbertura().setMes(8);
		// c2.getDataDeAbertura().setAno(2020);

		c2.setTitular(new Cliente());
		c2.getTitular().setNome("Ze Maria");
		c2.getTitular().setEndereco("XV de Novembro, 999");
		c2.getTitular().setCpf("987.654.321-10");
		c2.getTitular().setIdade(25);

		System.out.println(c2.recuperaDadosParaImpressao());

		if (c1.transfere(70, c2)) {
			System.out.println("Tranferencia realizada com sucesso");
		} else {
			System.out.println("Operação não autorizada");
		}

		Conta c3 = new ContaCorrente(cli1);
		c3.setAgencia("45678-9");

		System.out.println();
		System.out.println("Depois");
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c2.recuperaDadosParaImpressao());
		System.out.println(c3.recuperaDadosParaImpressao());

	}

}
