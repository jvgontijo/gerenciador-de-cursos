package io.github.jvgontijo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestaHashMap {
	public static void main(String[] args) {
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        
        //iteirando a key
        for (String string : nomesParaIdade.keySet()) {
			System.out.println(string);
		}
        
        //iteirando o valor
        for (Integer idade : nomesParaIdade.values()) {
        	System.out.println(idade);
		}
        
        
        //pegando a associacao
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String, Integer> entry : associacoes) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
