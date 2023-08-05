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
	public void updateBalance(Double interestRate) {
		double percentual = balance * (interestRate / 100);
		balance += percentual;
	}
	
	@Override  // -> Sobreprosição: se ouver erro no nome do método em relação a superClasse irá apresentar erro.
	public void withdraw(double amount) {
		// Trava para não ocorrer saque acima do saldo disponível.
		if(amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Valor do saque excede o saldo!");
		}
	}
	
	// "super.toString()" -> Sobrescrever o método toString() para representação em string da classe "SavingsAccount"
	@Override
	public String toString() {
		return super.toString() + " \ntaxa de remuneração: " + interestRate + "%"  
				                + " \nSaldo atualizado: R$ " + balance;
	}

}
