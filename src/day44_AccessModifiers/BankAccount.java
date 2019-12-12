package day44_AccessModifiers;

public class BankAccount {
	
	/*
	 WarmUp: creata a custom class for bankaccount
    The attributes/data that the class can have are: 
            AccountHolder, AccountName, AvailableBalance
    Actions the class can do are:
            deposit, withdraw, checking balance
    requiremnets:
            1. apply encapsulations
            2. user should be able to deposit, withdraw and check the balance
                2.1 if the withdrawing account is greater than available balance, 35$ penalty fee will be charger from the account
                2.2 if the available balance is less or equal to 0, account holder won't be able to withdraw money

	 */
	// 1.  getter (read only) Encapsulation.
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
	public String getAccountHolder() {
		return  AccountHolder;
		
	}
	
	public long getAccountNumber() {
		return AccountNumber;
		
	}
	
	public double getAvailableBalance() {
		return AvailableBalance;
		
	}
	
	// setter (Modify):instance void method, passes a parameter
	
	public void setAccountHolder(String AccountHolder) {
		 this.AccountHolder =  AccountHolder;
	}
	public void setAccountNumber(long AccountNumber) {
		 this.AccountNumber =  AccountNumber;
	}
	
	
	// 2. Actions:
	   //deposit 
	
	public void Deposit(double amount) {
		AvailableBalance += amount;
		
	}
	   //withdraw
	
	public void Withdraw(double amount) {
		
		if(AvailableBalance<=0) {
			System.out.println("your avvount balance is less or equal to 0");
			return;
		}
		if (amount>AvailableBalance ) {
			AvailableBalance-= 35;
		}
		AvailableBalance -= amount;
	}	
       /*
        * Same output
        * 
       if(AvailableBalance <= 0) {
                    
                    System.out.println("your account balance is less or equal to 0");
                
                } else if(amount > AvailableBalance) {
                    AvailableBalance -= amount;
                    AvailableBalance -= 35;
                } else {
                    AvailableBalance -= amount;
                }

         */

// checking balance
	
	public void ShowBalance() {
		System.out.println("Avalable balance is: "+AvailableBalance);
	}
	
	
	// Get account info
	
	public void getAccountInfo() {
        System.out.println("Name: " + getAccountHolder() );
        System.out.println( "Account Number: "+ getAccountNumber() );
        System.out.println("Available Balance: "+getAvailableBalance());
    }

	}
	

