package oop;

public class BankAccountApp {
public static void main(String[] args)
{
	BankAccount acc1 = new BankAccount();
	
	//acc1.name = "roger du"
	acc1.setName("Roger due");
	System.out.println(acc1.getName());
	acc1.setSsn("987654");
	System.out.println("SSN is " + acc1.getSsn());
	
	acc1.accountNumber = "01234567";
	acc1.balance = 10000;
	acc1.setRate();
	acc1.increaseRate();
	
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.withdraw(2000);
	System.out.println(acc1.toString());

	/*
	BankAccount acc2 = new BankAccount("Checking Account");
	acc2.accountNumber = "01234567";
	
	BankAccount acc3 = new BankAccount("Savings Account", 5000);
	acc3.accountNumber = "01234567";
	acc3.checkBalance();
	
	
	//inheritance
	CDAccount cd1 = new CDAccount();
	cd1.accountType = "CD Account" ;
	cd1.balance = 3000;
	cd1.interestRate = "4.5";
	cd1.name = "june";
	System.out.println(cd1.toString());
	cd1.compound();
	*/
}
}
