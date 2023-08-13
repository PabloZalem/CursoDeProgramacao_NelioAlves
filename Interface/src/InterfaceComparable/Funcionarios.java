package InterfaceComparable;

public class Funcionarios implements Comparable<Funcionarios>{
	private String nome;
	private Double salario;
	public Funcionarios(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
//Comparar um objeto com o outro, como você compara o seu objeto com o outro objeto que vc quer informar
	//Ordem Crescente
	//Caso queira que seja decrescente, colocar o menos na frente de -
	@Override
	public int compareTo(Funcionarios outro) {
		return nome.compareTo(outro.getNome());
	}
}
