package HerancaEPolimorfismo;

public class PessoaFisica extends PagadorDeImposto{
	private Double gastosComSaude;
	
	public PessoaFisica() {
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double tax() {
		//double taxaBase = (getRendaAnual() < 20000) ? taxaBase = getRendaAnual() * 0.15 : taxaBase = getRendaAnual() * 0.25;
			
		double taxaBase;
		if(getRendaAnual() < 20000) {
			taxaBase = getRendaAnual() * 0.15;	
		}else {
			taxaBase = getRendaAnual() * 0.25;
		}
		taxaBase = taxaBase - (getGastosComSaude() * 0.5);
		if (taxaBase < 0) {
			return 0.0;
		}
		return taxaBase;
	}
}