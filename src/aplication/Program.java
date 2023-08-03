package aplication;

import java.util.*;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do titular: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String holder = sc.nextLine();
		
		System.out.print("Saldo: ");
		double balance = sc.nextDouble();
		
		Account accont = new Account(number, holder, balance);
		
		System.out.println(" ");
		System.out.println("Dados da conta:");
		System.out.println(accont);
		
		sc.close();

	}

}
