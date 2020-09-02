package fixacao4;

import br.com.jeysonn.git.Data;

public class TestaPorta {

	public static void main(String[] args) {
		
		Data data = new Data();
		
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
			System.out.println("A porta est� aberta");
		} else {
			System.out.println("A porta est� fechada");
		}
		
		Casa c = new Casa();
		c.porta1.fecha();
		System.out.println(c.quantasPortasEstaoAbertas());

	}

}
