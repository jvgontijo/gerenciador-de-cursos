package io.github.jvgontijo;

import java.util.Set;
import java.util.TreeSet;

import io.github.jvgontijo.model.Recibo;

public class TestaTreeSet {
	public static void main(String[] args) {
		Recibo r1 = new Recibo(1533216);
		Recibo r2 = new Recibo(4459987);
		Recibo r3 = new Recibo(5465543);
		
		Set<Integer> recibos = new TreeSet<Integer>();
		
		recibos.add(r3.getCodigo());
		recibos.add(r2.getCodigo());
		recibos.add(r1.getCodigo());
		
		recibos.forEach(codigo -> {
			System.out.println("Código do recibo: " + codigo);
		});
	}
}
