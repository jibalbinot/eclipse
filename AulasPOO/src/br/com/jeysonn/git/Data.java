package br.com.jeysonn.git;

public class Data {
	int dia;
	int mes;
	int ano;

	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	//overloading - sobrecarga
	String formatada(int x) {
		return this.mes + "/" + this.dia + "/" + this.ano;
	}
}
