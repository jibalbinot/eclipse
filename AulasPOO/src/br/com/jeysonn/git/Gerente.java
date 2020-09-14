package br.com.jeysonn.git;

public class Gerente extends Funcionario {
	private int senha = 123;
	private int numeroDeFuncionariosGerenciados;
	protected double bonus = 777;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	@Override
	public double getVencimento() {
		return this.getSalario() + this.getBonificacao() + this.bonus;
	}
	
	@Override
	public String toString() {
		String dados = "";
		dados += super.toString();//chama o toString da superclasse (Funcionario)
		dados += "Bonus..: " + this.bonus + "\n";
		return dados;
	}
	
	@Override
	public double getBonificacao() {
        return super.getBonificacao() * 1.5;
        //o Gerente sempre terá uma bonificação 50% (1.5) superior ao Funcionario
    }
}
