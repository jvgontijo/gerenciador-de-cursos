package io.github.jvgontijo;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
		String curso1 = "Java.util";
		String curso2 = "Java.lang";
		String curso3 = "Java.io";
		String curso4 = "Lógica de Programação";
		
		ArrayList<String> cursos = new ArrayList<String>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		
		cursos.remove(3);
		System.out.println(cursos);
		System.out.println(cursos.get(0));
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i));
			
		}
		
		Collections.sort(cursos);
		System.out.println(cursos);
	}
}
