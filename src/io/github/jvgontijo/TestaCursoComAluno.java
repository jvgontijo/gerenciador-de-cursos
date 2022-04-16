package io.github.jvgontijo;

import java.util.Set;

import io.github.jvgontijo.model.Aluno;
import io.github.jvgontijo.model.Aula;
import io.github.jvgontijo.model.Curso;

public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso javaCollection = new Curso("Java Collection", "Paulo Silveira");
		
		javaCollection.matricula(new Aluno("João Victor", 166601));
		javaCollection.matricula(new Aluno("Gustavo", 166602));
		javaCollection.matricula(new Aluno("Ana", 166603));
		
		Aluno aluno0 = new Aluno("Murilo", 166402);
		Aluno aluno1 = new Aluno("Murilo", 123312);
		
		javaCollection.matricula(aluno1);
		javaCollection.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
	
//		boolean matriculado = javaCollection.estaMatriculado(aluno1);
//		System.out.println(matriculado);
		System.out.println(aluno1.equals(aluno0));
		
	}
}
