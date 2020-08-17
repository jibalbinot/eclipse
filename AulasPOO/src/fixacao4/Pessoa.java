package fixacao4;

public class Pessoa {
	String nome;
	int idade = 0;

	void fazAniversario() {
		this.idade++;
	}

	String recuperaDados() {
		String dados = "";
		dados += "Nome.: " + this.nome + "\n";
		dados += "Idade: " + this.idade + " anos\n";
		return dados;
	}
}
