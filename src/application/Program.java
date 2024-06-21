package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainExpections;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withDrawLimit = sc.nextDouble();
			Account account = new Account(number, name, balance, withDrawLimit);

			System.out.println();
			System.out.print("Enter amount for withDraw: ");
			double withDraw = sc.nextDouble();
			account.withDraw(withDraw);

			System.out.println(account);

			sc.close();

		} catch (DomainExpections e) {
			System.out.println("WithDraw error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		;
	}

}
