package CriandoFuncoesQueRecebemFuncoes;

import java.util.List;
import java.util.function.Predicate;

public class ServicoDeProduto {
	public double somaFiltrada(List<Product> list, Predicate<Product> criterio) {
		double soma = 0.0;
		
		for(Product p : list) {
			if(criterio.test(p)) {
				soma += p.getPrice();
			}
		}
		return soma;
	}
}
