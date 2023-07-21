package ConceitosDePOO;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotal() {
		return preco * quantidade;
	}

	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}

	public void retirarQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return nome 
 			+ ", $ "
 			+ String.format("%.2f", preco)
 			+ ", "
 			+ quantidade 
 			+ " unidade, Total: $"
 			+ String.format("%.2f", valorTotal());
	}
}
