package io.github.jvgontijo.model;

import java.util.Comparator;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int minutos) {
		this.titulo = titulo;
		this.tempo = minutos;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", Tempo: " + this.tempo + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}
}
