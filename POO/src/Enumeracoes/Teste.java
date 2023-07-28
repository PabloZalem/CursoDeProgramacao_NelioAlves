package Enumeracoes;

import java.util.Date;

public class Teste {
	public static void main(String[] args) {
		Pedido p1 = new Pedido(1000, new Date(), Status.AGUARDANDO_PAGAMENTO);
		System.out.println(p1.toString());
		
		
		Status s1 = Status.ENTREGUE;
		Status s2 = Status.valueOf("ENTREGUE");
		System.out.println(s1);
		System.out.println(s2);
	}
}
