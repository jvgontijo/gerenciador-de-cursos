package io.github.jvgontijo;

import io.github.jvgontijo.model.Aluno;
import io.github.jvgontijo.model.Curso;

public class TestaHashMapInsercaoBuscaAlunoEmCurso {
	public static void main(String[] args) {
		
		Curso curso = new Curso("Sistemas", "Joao");
		
		curso.matricula(new Aluno("Gabriel", 202210156));
		curso.matricula(new Aluno("Ana", 202210157));
		curso.matricula(new Aluno("Murilo", 202210158));
		curso.matricula(new Aluno("Aldo", 202210159));
		
		
		System.out.println(curso.buscaMatriculado(202210158));
	}
}
