package ClasseAbstrata;

//Para evitar que seja criada subclasses utiliza-se o final
//Colocar final no método ele não pode ser sobreposto @Override
public class ContasSalvas extends Conta{
	private Double interestRate;
	
	public ContasSalvas() {
		super();
	}

	public ContasSalvas(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
