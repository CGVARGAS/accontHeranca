package aplication;

import java.util.*;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sistema de abertura de contas: ");
		System.out.println("=============================  ");
		System.out.println("\n1) Conta Pessoa Física \n2) Conta Pessoa Jurídica \n3) Poupança\n ");
		System.out.print("Tipo de conta: ");
		int conta = sc.nextInt();
		if(conta == 1) {
			System.out.print("Número da conta PF: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String holder = sc.nextLine();
			System.out.print("Saldo: ");
			double balance = sc.nextDouble();
			
			Account account = new Account(number, holder, balance);
			
			System.out.println("Conta aberta com sucesso!");
			System.out.println(" ");
			System.out.println(account);
		}
		else if(conta == 2) {
			System.out.print("Número da conta PJ: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String holder = sc.nextLine();
			System.out.print("Saldo: ");
			double balance = sc.nextDouble();
			System.out.print("Limite PJ: ");
			double limit = sc.nextDouble();
		
			/* UPCASTING -> declaração de variável "businessAccont" da superclasse: "Accont" 
			 * atribuindo objeto da variável da subclasse: "BusinessAccount"*/  
			Account businessAccount = new BusinessAccount(number, holder, balance, limit);
			
			System.out.println("Conta aberta com sucesso!");
			System.out.println(" ");
			
			System.out.print("Empréstimo (s/n): ");
			char emprestimo = sc.next().charAt(0);
			if(emprestimo == 's') {
				System.out.print("Valor: ");
				double valor = sc.nextDouble();
				// Downcasting para BusinessAccount
		        ((BusinessAccount) businessAccount).loan(valor);
				System.out.println(businessAccount);
			}else {
				System.out.println(businessAccount);
			}
				
		}
		else if(conta == 3) {
			System.out.print("Número da Poupança: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String holder = sc.nextLine();
			System.out.print("Saldo: ");
			double balance = sc.nextDouble();
			System.out.print("Taxa de juros: ");
			double interestRate = sc.nextDouble();
			
			/* UPCASTING -> declaração de variável "savingsAccont" da superclasse: "Accont" 
			 * atribuindo objeto da variável da subclasse: "SavingsAccount"*/  
			SavingsAccount savingsAccont = new SavingsAccount(number, holder, balance, interestRate);
			savingsAccont.updateBalance(interestRate);
			System.out.println("Conta aberta com sucesso!");
			
			System.out.println(" ");
			System.out.print("Saque (s/n): ");
			char saque = sc.next().charAt(0);
			if(saque == 's') {
				System.out.print("Valor: ");
				double valor = sc.nextDouble();
				// Downcasting para BusinessAccount
				((SavingsAccount) savingsAccont).withdraw(valor);
				System.out.println(savingsAccont);	
			}else {
				
				System.out.println(savingsAccont);
			}
				
		}else {
			System.out.println("Opção inválida!");
			System.out.println("Encerrando o programa!");
		}
		sc.close();
	}
}
