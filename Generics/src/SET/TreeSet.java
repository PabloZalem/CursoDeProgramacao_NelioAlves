package SET;

import java.util.Arrays;
import java.util.Set;
import java.util.*;

public class TreeSet {
	public static void main(String[] args) {
		Set<Integer> a = new java.util.TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new java.util.TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		// union
		Set<Integer> c = new java.util.TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		// intersection
		Set<Integer> d = new java.util.TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		// difference
		Set<Integer> e = new java.util.TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}
}
