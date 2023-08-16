package Generics;

public class Pair<T, U> {
	private T first;
	private U second;

	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}

	public static void main(String[] args) {
		Pair<Integer, String> pair1 = new Pair<>(1, "One");
		Pair<String, Double> pair2 = new Pair<>("Two", 2.0);

		System.out.println("Pair 1: " + pair1.getFirst() + ", " + pair1.getSecond());
		System.out.println("Pair 2: " + pair2.getFirst() + ", " + pair2.getSecond());
	}
}
