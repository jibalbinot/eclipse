package fixacao4;

public class TestaPorta {

	public static void main(String[] args) {
		Porta p = new Porta();
		p.abre();
		p.fecha();
		p.pinta("azul");
		p.pinta("vermelho");
		p.dimensaoX = 90;
		p.dimensaoY = 200;
		p.dimensaoZ = 10;
		p.abre();
		if(p.estaAberta()) {
			System.out.println("A porta está aberta");
		} else {
			System.out.println("A porta está fechada");
		}
		
		Casa c = new Casa();
		c.porta1.fecha();
		System.out.println(c.quantasPortasEstaoAbertas());

	}

}
