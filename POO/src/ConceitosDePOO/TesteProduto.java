package ConceitosDePOO;

import java.util.Scanner;

public class TesteProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produto1 = new Produto();
		
		System.out.println("Entra com o nome do produto: ");
		System.out.print("Nome: ");
		produto1.nome = sc.nextLine();
		System.out.print("Preco: ");
		produto1.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto1.quantidade = sc.nextInt();
		
		System.out.println(produto1.toString());
		
		System.out.println("Me informe a quantidade que sera adicionada: ");
		int quantidade = sc.nextInt();
		produto1.adicionarQuantidade(quantidade);
		
		System.out.println("Informe a quantidade que será retirado do estoque: ");
		quantidade = sc.nextInt();
		produto1.retirarQuantidade(quantidade);
		
		
		sc.close();
	}
}
