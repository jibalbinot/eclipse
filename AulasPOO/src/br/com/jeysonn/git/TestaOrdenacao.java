package br.com.jeysonn.git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaOrdenacao {
	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente("xxxx");
		cc1.deposita(888);

		ContaCorrente cc2 = new ContaCorrente("xxxx");
		cc2.deposita(222);

		ContaCorrente cc3 = new ContaCorrente("xxxx");
		cc3.deposita(777);

		ArrayList lista = new ArrayList();

		lista.add(5);
		lista.add(cc1);
		lista.add(8);
		lista.add("Jeysonn");
		lista.add(1);
		lista.add(3.14);
		lista.add(3);
		lista.add(0);

		System.out.println(lista);
		System.out.println(((ContaCorrente) (lista.get(1))).getSaldo());

		List lista2 = new ArrayList();

		lista2.add("ze maria");
		lista2.add("antonio");
		lista2.add("junior");
		lista2.add("luiz");
		System.out.println("Lista2: " + lista2);
		
		Collections.sort(lista2);
		
		System.out.println("Lista2: " + lista2);
		
		
		List lista3 = new ArrayList();
		
		lista3.add(cc1);
		lista3.add(cc2);
		lista3.add(cc3);
		
		System.out.println("Lista3: "+ lista3);
		
		Collections.sort(lista3);
		
		System.out.println("Lista3: "+ lista3);
		
		

	}
}
