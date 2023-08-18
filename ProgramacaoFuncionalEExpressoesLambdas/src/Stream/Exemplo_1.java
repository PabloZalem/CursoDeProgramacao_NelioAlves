package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exemplo_1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		//Criar uma stream a partir da lista
		Stream<Integer> st1 = list.stream();
		Stream<Integer> st1_1 = list.stream().map(x -> x * 10);
		//ISSO AQUI É UM TERMINAL
		System.out.println(Arrays.toString(st1.toArray()));
		System.out.println(Arrays.toString(st1_1.toArray()));
		
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//Funcao de iteracao
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//Fibonacci
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}
}
