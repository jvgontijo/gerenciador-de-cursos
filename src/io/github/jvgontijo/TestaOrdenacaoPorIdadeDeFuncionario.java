package io.github.jvgontijo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import io.github.jvgontijo.model.Funcionario;
import io.github.jvgontijo.model.OrdenaPorIdade;

public class TestaOrdenacaoPorIdadeDeFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Joao", 20);
		Funcionario f2 = new Funcionario("Ana", 19);
		Funcionario f3 = new Funcionario("Gabriel", 27);
		Funcionario f4 = new Funcionario("Murilo", 18);
		
		Set<Funcionario> funcionarios = new TreeSet<Funcionario>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		funcionarios.add(f4);
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}
}
