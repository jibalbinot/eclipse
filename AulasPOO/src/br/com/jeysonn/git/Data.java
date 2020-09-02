package br.com.jeysonn.git;

import java.time.LocalDate;

/**
 * Classe responsável por representar e manipular a datas
 *
 * @author Jeysonn Isaac Balbinot
 * @version 1
 * 
 */
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

	 /**
     * Metodo que retorna a data no formato String usando a sequência dia/mes/ano
     * @return String
     */
	public String formatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	
	/**
     * Metodo que retorna a data no formato String usando a sequência mes/dia/ano
     * @param a um numero qualquer
     * @return String
     */
	// overloading - sobrecarga
	public String formatada(int a) {
		return this.mes + "/" + this.dia + "/" + this.ano;
	}
}
