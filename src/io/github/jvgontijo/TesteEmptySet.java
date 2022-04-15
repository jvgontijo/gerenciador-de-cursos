package io.github.jvgontijo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import io.github.jvgontijo.model.Aluno;

public class TesteEmptySet {
	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
		nomes.add("Joao");
		
	}
}
