package Generics;

import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import java.util.List;

public class ImprimirServico {
	List<Integer> list = new ArrayList<>();
	
	public void adicionarValor(Integer valor) {
		list.add(valor);
	}
	
	public Integer primeiro() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia");
		}
			return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		for (int i = 1; i <= list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.print("]");
	}
}
