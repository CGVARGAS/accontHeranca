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
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
    
	// Método responsável em atualizar saldo através de taxa de juros adicionada pelo usuário
	public Double updateBalance(Double interestRate) {
		double percentual = 0;
		percentual = percentual * (interestRate / 100);
		return balance += percentual;
	}
	
	@Override  // -> Sobreprosição
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// "super.toString()" -> Sobrescrever o método toString() para representação em string da classe "SavingsAccount"
	@Override
	public String toString() {
		return super.toString() + " \ntaxa de remuneração: " + interestRate + "%"  
				                + " \nSaldo atualizado: R$ " + updateBalance(balance);
	}

}
