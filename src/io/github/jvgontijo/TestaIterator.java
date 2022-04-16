package io.github.jvgontijo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaIterator {
	public static void main(String[] args) {
		List<String> letras = new LinkedList<String>();
		letras.add("a");
		letras.add("b");
		letras.add("c");
		
		Iterator<String> iterador = letras.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
}
