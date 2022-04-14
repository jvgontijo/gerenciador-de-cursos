package io.github.jvgontijo;

import java.util.ArrayList;

import io.github.jvgontijo.model.Aula;

public class TestaListaAulas {
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Trabalhando com ArrayList", 25);
		Aula a2 = new Aula("Listas de Objetos", 19);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(a1);
		aulas.add(a2);
		
		System.out.println(aulas);
	}
}
