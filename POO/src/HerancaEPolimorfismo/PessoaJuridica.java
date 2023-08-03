package HerancaEPolimorfismo;

public class PessoaJuridica extends PagadorDeImposto{
	private Integer numeroDeFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double tax() {
		if (numeroDeFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		}else {
			return getRendaAnual() * 0.16;
		}
	}

}
