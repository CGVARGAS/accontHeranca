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
	
	// implementar o método para uso do limite e cobrança de taxa...
	public void loan(double amount) {
		if(amount <= loanLimit) {
			loanLimit = loanLimit - amount;
		    balance += amount - 10.0;
			
		}else {
			System.out.println("Valor do empréstimo excede o limite!");
		}
			
	}
    
	@Override
	public String toString() {
		return super.toString() + " \nLimite Disponível: R$ " + loanLimit;
	}
}
