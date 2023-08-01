package Heranca_1;

public class Main {
	public static void main(String[] args) {
		Conta cc = new Conta(1001, "Pablo", 0.0);
		ContaBusiness cb = new ContaBusiness(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		//Relacao é-um;
		Conta cc1 = cb;
		Conta cc2 = new ContaBusiness(1003, "Joao", 0.0, 200.0);
		Conta cc3 = new ContasSalvas(1004, "Joao", 0.0, 0.01);
		
		//DOWNCASTING
		ContaBusiness cc4 = (ContaBusiness) cc2;
		cc4.loan(100.0);
		//ContaBusiness cc5 = (ContaBusiness) cc3;
		if (cc3 instanceof ContaBusiness) {
			ContaBusiness cc5 = (ContaBusiness) cc3;
			cc5.loan(200.0);
			System.out.println("Loan");
		}
		
		if (cc3 instanceof ContasSalvas) {
			ContasSalvas cc5 = (ContasSalvas) cc3;
			cc5.updateBalance();
			System.out.println("Update");
		}
		
		Conta cc6 = new Conta(1005, "Pablo", 1000.0);
		cc6.withdraw(200.0);
		System.out.println(cc6.getBalance());
		
		
		Conta cc7 = new ContasSalvas(1006, "Luiz", 1000.0, 0.01);
		cc7.withdraw(200.0);
		System.out.println(cc7.getBalance());
		
		Conta cc8 = new ContaBusiness(1007, "Marcela", 1000.0, 500.0);
		cc8.withdraw(200.0);
		System.out.println(cc8.getBalance());
	}
}
