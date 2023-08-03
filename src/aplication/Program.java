package aplication;

import java.util.*;
import entities.Account;
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe o tipo de conta (1 - Conta Pessoa Física, 2 - Conta Pessoa Jurídica): ");
		int conta = sc.nextInt();
		if(conta == 1) {
			System.out.print("Número da conta PF: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String holder = sc.nextLine();
			System.out.print("Saldo: ");
			double balance = sc.nextDouble();
		
			Account accont = new Account(number, holder, balance);
			System.out.println(" ");
			System.out.println("Dados da conta PF:");
			System.out.println(accont);
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
		
			BusinessAccount businessAccont = new BusinessAccount(number, holder, balance, limit);
			System.out.println(" ");
			System.out.println("Dados da conta PJ:");
			System.out.println(businessAccont);
			
		}else {
			System.out.println("Opção inválida! Encerrando o programa!");
		}
		sc.close();
	}
}
