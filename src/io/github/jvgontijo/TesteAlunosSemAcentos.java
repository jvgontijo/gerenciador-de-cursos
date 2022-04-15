package io.github.jvgontijo;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();
		
		alunos.add("AJG");
		alunos.add("JVG");
		alunos.add("GLS");
		alunos.add("APP");
		alunos.add("MRS");
		
		System.out.println("Tamanho do conjunto: " + alunos.size());
		alunos.add("JVG");
		System.out.println("Tamanho do conjunto: " + alunos.size());
	
		boolean adicionado = alunos.add("APP");
		System.out.println("Foi adicionado? " + adicionado);
	}
}
