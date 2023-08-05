package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	//Método padrão
	public BusinessAccount() {	
		super();
	}
    
	//Método construtor
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	// Libera emprestimo diminuindo o limite e descontando taxa de 10.0
	public void loan(double amount) {
		if(amount <= loanLimit) {
			loanLimit = loanLimit - amount;
		    balance += amount - 10.0;
			
		}else {
			System.out.println("Valor do empréstimo excede o limite!");
	    }
	}
	
	@Override
	public void withdraw(double amount) {
		
		// Desconta do saldo o valor de 2.00; 
		if(amount <= balance) {
			// Reutiliza o código da superclasse para efetuar o saque da conta
			super.withdraw(amount);
			balance -= 2.0;
		
		}else {
			System.out.println("Valor do saque excede o saldo!\n");
		}
		
	}
			
	@Override
	public String toString() {
		return super.toString() + " \nLimite Disponível: R$ " + loanLimit;
	}
}
