package br.com.jeysonn.git;

import java.time.LocalDate;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		//pega a data atual do sistema
		LocalDate localDate = LocalDate.now();
		this.dia = localDate.getDayOfMonth();
		this.mes = localDate.getMonthValue();
		this.ano = localDate.getYear();
	}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	// overloading - sobrecarga
	String formatada(int a) {
		return this.mes + "/" + this.dia + "/" + this.ano;
	}
}
