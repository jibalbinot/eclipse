package fixacao4;

public class Porta {
	boolean aberta = true;
	String cor;
	int dimensaoX, dimensaoY, dimensaoZ;
	
	void abre() {
		this.aberta = true;
	}
	
    void fecha() {
    	this.aberta = false;
    }
    
    void pinta(String cor) {
    	this.cor = cor;
    }
    
    boolean estaAberta() {
    	return this.aberta;
    }
}
