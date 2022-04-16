package io.github.jvgontijo.model;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[ Aluno: " + this.nome + ", Matrícula: " + this.numeroMatricula + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
