package io.github.jvgontijo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import io.github.jvgontijo.model.Aula;

public class TestaListaAulas {
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Trabalhando com ArrayList", 25);
		Aula a2 = new Aula("Listas de Objetos", 19);
		Aula a3 = new Aula("Aprendendo Lógica de Programação", 20);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//ordenando por nome de acordo com toString
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//ordenando por tempo
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}
}
