package oop;

public class BankAccount implements IRate {
String accountNumber;
private static final String routingNumber = "0123456";
private String name;
private String ssn;
String accountType;
double balance;
BankAccount()
{
	System.out.println("New Account created");
}


//overloading

BankAccount(String accountType)
{
	System.out.println("NEW ACCOUNT:" + accountType );
}

BankAccount(String accountType, double initDeposit)
{
	System.out.println("NEW ACCOUNT:" + accountType );
	System.out.println("Deposit of : $ " + initDeposit );
	String Msg = null;
	if (initDeposit < 1000)
	{
		 Msg = "min deposit should be 1000";
	}
	else
	{
		Msg = "Thanks fo your initial deposit of: $" + initDeposit;
	}
		System.out.println(Msg);
	balance = initDeposit;
}

//Getters / Setters
//Allow user to define name
public void setName(String name)
{
	this.name = "Mr." + name;
}
public String getName()
{
	return name;
}




public String getSsn() {
	return ssn;
}


public void setSsn(String ssn) {
	this.ssn = ssn;
}

//Interface methods
public void setRate() {
	System.out.println("Settings rate");
}
public void increaseRate() {
	System.out.println("INCREASING RATE");
}

public void deposit( double amount)
{
	balance = balance + amount;
	showActivity("DEPOSIT");
}

void withdraw(double amount)
{
	balance = balance + amount;
	showActivity("WITHDRAW");

}

private void showActivity(String activity) 
{
	System.out.println("recent activity: " + activity);
	System.out.println("new balance is : $ " + balance);
}
void checkBalance()
{
	System.out.println("Balance: " + balance);
}
void getStatus()
{
	
}

public String toString() {
	return "[ NAME: " + name + ",ACCOUNT NO. "  + accountNumber + "routing#" + routingNumber +". BALANCE: $" + balance + "]";
}
}
