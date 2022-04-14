package io.github.jvgontijo.model;

public class Aula {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int minutos) {
		this.titulo = titulo;
		this.tempo = minutos;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getMinutos() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", Tempo: " + this.tempo + " minutos]";
	}
}
