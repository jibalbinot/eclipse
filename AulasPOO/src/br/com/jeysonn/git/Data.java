package br.com.jeysonn.git;

public class Data {
	int dia;
	int mes;
	int ano;

	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
