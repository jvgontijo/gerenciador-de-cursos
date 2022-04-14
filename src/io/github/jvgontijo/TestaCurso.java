package io.github.jvgontijo;

import java.util.List;

import io.github.jvgontijo.model.Aula;
import io.github.jvgontijo.model.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso curso = new Curso("Java Collections", "Paulo Silveira");
		
		curso.getAulas().add(new Aula("Trabalhando com ArraList", 25));
		curso.getAulas().add(new Aula("Listas de objetos", 19));
		curso.getAulas().add(new Aula("Relacionamentos com coleções", 22));
		
		List<Aula> aulas = curso.getAulas();
		
		
		System.out.println(aulas);
	}
}
