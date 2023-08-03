package MetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<Forma> list = new ArrayList<>();
		
		System.out.println("Entra com numero de formas: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Forma #" + i + "data: ");
			System.out.println("Retangulo ou Circulo (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Cor: PRETO, AZUL OU VERMELHO: ");
			Cores cores = Cores.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(largura, altura, cores));
			}else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(cores, raio));
			}
		}
		
		System.out.println();
		System.out.println("Areas de Formas: ");
		for (Forma forma : list) {
			System.out.println(String.format("%.2f",forma.area()));
		}
		
		sc.close();
	}
}
