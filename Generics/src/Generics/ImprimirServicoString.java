package Generics;

import java.util.ArrayList;
import java.util.List;

public class ImprimirServicoString<T> {
	List<T> list = new ArrayList<>();
	
	public void adicionarValor(T valor) {
		list.add(valor);
	}
	
	public T primeiro() {
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
