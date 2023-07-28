package ExercicioDeComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		Produto p = new Produto("TV", 1000.00);
		PedidoDoItem pdt = new PedidoDoItem(1, 1000.0, p);
		Cliente cliente = new Cliente("Maria", "maria@maria.com",sdf.parse("07/11/1998"));
		
		System.out.println(pdt.getQuantidade());
		System.out.println(pdt.getProduto().getNome());
		System.out.println(pdt.toString());
		System.out.println(cliente);
		
		System.out.print("Entra com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date data = sdf.parse(sc.next());
		
		Cliente c1 = new Cliente(nome, email, data);
		
		System.out.print("Entra com os dados do pedido: ");
		System.out.print("Status: ");
		StatusDoPedido pedido = StatusDoPedido.valueOf(sc.next());
		
		Pedido pedido2 = new Pedido(data,pedido,c1);
		
		System.out.println("Quantos itens para este item: ");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			System.out.println("Entra #"+i+"item data: ");
			System.out.println("Nome do Produto: ");
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			System.out.print("Preco do produto: ");
			double precoDoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeDoProduto, precoDoProduto);
			
			PedidoDoItem item = new PedidoDoItem(quantidade, precoDoProduto, produto);
			pedido2.adicionarItem(item);
		}
		
		System.out.println();
		System.out.println(pedido2);
	
		sc.close();
	}
}
