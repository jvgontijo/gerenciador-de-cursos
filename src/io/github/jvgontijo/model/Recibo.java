package io.github.jvgontijo.model;

public class Recibo implements Comparable<Recibo> {
	
	private int codigo;
	
	public Recibo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public int compareTo(Recibo o) {
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		Recibo r = (Recibo) obj;
		return this.codigo == r.codigo;
	}
	
	@Override
	public String toString() {
		return "[ Recibo: " + this.codigo + "]";
	}
}
