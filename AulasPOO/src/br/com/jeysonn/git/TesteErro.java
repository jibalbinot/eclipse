package br.com.jeysonn.git;

import java.io.FileNotFoundException;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("inicio do main");

		try {
			int i = 5571;
			i = i / 0;
			System.out.println("Resultado: " + i);
		} catch (RuntimeException e) {
			System.out.println("Erro; " + e);
		}

		try {
			metodo1();
		} catch (NullPointerException e) {
			System.out.println("Estou no main Erro de ponteiro nulo: " + e);
		} catch (FileNotFoundException e) {
			System.out.println("Erro de arquivo inexistente: " + e);
		}
		System.out.println("fim do main");
	}

	static void metodo1() throws FileNotFoundException {
		System.out.println("inicio do metodo1");
		// new java.io.FileInputStream("arquivo.txt");//forçando um erro de arquivo não encontrado
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() throws NullPointerException{
		System.out.println("inicio do metodo2");
		ContaCorrente cc = new ContaCorrente("45678-9");

		for (int i = 0; i <= 15; i++) {
			cc.deposita(i + 1000);
			System.out.println(cc.getSaldo());
			if (i == 5) {
				cc = null;//forçando um erro de ponteiro nulo
			}

		}

		System.out.println("fim do metodo2");
	}
}
