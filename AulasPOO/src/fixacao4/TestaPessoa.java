package fixacao4;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Maria Aparecida";
		
		System.out.println(p.recuperaDados());
		
		p.fazAniversario();
		p.fazAniversario();
		
		System.out.println(p.recuperaDados());

	}

}
