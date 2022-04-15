package io.github.jvgontijo;

import io.github.jvgontijo.model.Aluno;
import io.github.jvgontijo.model.Aula;
import io.github.jvgontijo.model.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaCollection = new Curso("Java Collection", "Paulo Silveira");
		
		javaCollection.matricula(new Aluno("João Victor", 166601));
		javaCollection.matricula(new Aluno("Gustavo", 166601));
		javaCollection.matricula(new Aluno("Ana", 166601));
		javaCollection.matricula(new Aluno("Gabriel", 166601));
		
		javaCollection.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
	}
}
