package entities;

public class SavingsAccount extends Account{
	private Double interestRate;

	
	public SavingsAccount( ) {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public Double updateBalance(Double interestRate) {
		 double percentual = (interestRate / 100);
		 return balance += percentual;
	}
	
	@Override
	public String toString() {
		return super.toString() + " \ntaxa de remuneração: " + interestRate + "%"  
				                + " \nSaldo atualizado: R$ " + updateBalance(balance);
	}

}
