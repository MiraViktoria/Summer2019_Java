package day44_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
	
	public static void main(String[] args) {
		BankAccount Mira = new BankAccount();
		Mira.setAccountHolder("Mira Rohrbach");
		Mira.setAccountNumber(12263389995L);	
		
		System.out.println("Name: " +Mira.getAccountHolder());
		System.out.println("Account Number: "+ Mira.getAccountNumber());
		System.out.println("Available Balance: "+ Mira.getAvailableBalance());
		
		Mira.Withdraw(2000);
		Mira.ShowBalance(); //2000
		
		Mira.Withdraw(2500);
		Mira.ShowBalance();
		
		Mira.Deposit(100000);
		Mira.ShowBalance();
		

	BankAccount Viktoria = new BankAccount();
	Viktoria.setAccountHolder("Viktoria");
	Viktoria.setAccountNumber(3937539579L);
	
	Viktoria.getAccountInfo();
	
	Viktoria.Deposit(10000);
	Viktoria.ShowBalance(); //10000
	 
	Viktoria.Withdraw(3000);
	Viktoria.getAccountInfo();
	
	BankAccount[] accounts = {Mira, Viktoria};
	
	ArrayList<BankAccount> Accounts = new ArrayList<>();
	
	//Accounts.add(Mira);
	//Account.add(Viktoria);
	Accounts.addAll(Arrays.asList(Mira,Viktoria));
	}

}
