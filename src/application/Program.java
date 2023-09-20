package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposist ?(y/n) ");
		char awnser = sc.next().charAt(0);
		double amount = 0.0;
		
		
		if (awnser == 'y') {
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
		}
		
		
		System.out.println();
		Account acc = new Account(number, holder, amount);
		System.out.println("Account data: ");
		System.out.println(acc.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		acc.deposit(amount);
		System.out.println("Updated Account data: ");
		System.out.println(acc.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.println("Updated Account data: ");
		System.out.println(acc.toString());
		
		sc.close();
		
	}

}
