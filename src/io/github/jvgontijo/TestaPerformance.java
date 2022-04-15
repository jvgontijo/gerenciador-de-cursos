package io.github.jvgontijo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaPerformance {
	public static void main(String[] args) {
		Collection<Integer> numerosList = new ArrayList<Integer>();
		long inicio = System.currentTimeMillis();
		long inicioInsercaoLista = System.currentTimeMillis();
		for (int i = 0; i <= 50000; i++) {
			numerosList.add(i);
		}
		long fimInsercaoLista = System.currentTimeMillis();
		
		System.out.println("Tempo de execução da Inserção na Lista: " + (fimInsercaoLista - inicioInsercaoLista) + "ms");
		
		long inicioBuscaLista = System.currentTimeMillis();
		for (Integer numero : numerosList) {
			numerosList.contains(numero);
		}
		long fimBuscaLista = System.currentTimeMillis();
		
		System.out.println("Tempo de execução de Busca na Lista: " + (fimBuscaLista- inicioBuscaLista) + "ms");
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo de execução ArrayList: " + (fim - inicio) + "ms");
	
		System.out.println("---------------------");
		
		Collection<Integer> numerosSet = new HashSet<Integer>();
		long inicio2 = System.currentTimeMillis();
		long inicioInsercaoHashSet = System.currentTimeMillis();
		for (int i = 0; i <= 50000; i++) {
			numerosSet.add(i);
		}
		long fimInsercaoHashSet = System.currentTimeMillis();
		System.out.println("Tempo de execução de Inserção no HashSet: " + (fimInsercaoHashSet - inicioInsercaoHashSet) + "ms");
		
		long inicioBuscaHashSet = System.currentTimeMillis();
		for (Integer numero : numerosSet) {
			numerosSet.contains(numero);
		}
		long fimBuscaHashSet = System.currentTimeMillis();
		System.out.println("Tempo de execução de Busca no HashSet: " + (fimBuscaHashSet - fimBuscaHashSet) + "ms");
		
		long fim2 = System.currentTimeMillis();
		
		System.out.println("Tempo de execução HashSet: " + (fim2 - inicio2) + "ms");
	
	
	}
}
