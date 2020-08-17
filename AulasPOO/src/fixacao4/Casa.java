package fixacao4;

public class Casa {
	String cor;
	Porta porta1 = new Porta();
	Porta porta2 = new Porta();
	Porta porta3 = new Porta();
	
	int quantasPortasEstaoAbertas() {
		int quantidade = 0;
		if (porta1.estaAberta()) {
			quantidade++;
		}
		if (porta2.estaAberta()) {
			quantidade++;
		}
		if (porta3.estaAberta()) {
			quantidade++;
		}
		return quantidade;
	}
}
