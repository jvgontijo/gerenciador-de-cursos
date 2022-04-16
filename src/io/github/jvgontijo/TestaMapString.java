package io.github.jvgontijo;

import java.util.HashMap;
import java.util.Map;

public class TestaMapString {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		pessoas.put(15, "Joao");
		pessoas.put(19, "Ana");
		pessoas.put(27, "Gabriel");
		pessoas.put(39, "Murilo");
		
		
//		for (Integer idade : pessoas.keySet()) {
//			System.out.println(idade);
//		}
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(idade);
		});
	}
}
