package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874", 1000);
		BankAccount acc2 = new BankAccount("465329874", 2000);
		BankAccount acc3 = new BankAccount("465329874", 2500);
		acc1.setName("Jimmy");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest{
	//properties of bank
	private static int iD = 1000;
	private String accountNumber; // id +random 2digits + 1st 2 of SSN
	private static final String routingNumber= "004500457";
	private String name;
	private String SSN;
	private double balance;
// constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
private void setAccountNumber() {
	int random = (int) (Math.random() * 100);
	accountNumber = iD + "" + random + SSN.substring(0,2);
	System.out.println(accountNumber);
}
public void setName(String name) {
	this.name = name;
	
}
public String getName() {
	return name;
}
public void payBill(double amount) {
System.out.println("paying bill of " + amount);
	balance = balance- amount;
	showBalance();
}
public void makeDeposit(double amount) {
	System.out.println("Making deposit of " + amount);
	balance = balance + amount;
	showBalance();
}
public void showBalance() {
	System.out.println("balance is " + balance);
	
}
@Override
public void accrue() {
	balance = balance * (1 + rate/100) ;
	showBalance();
	
}
@Override
public String toString() {
	return "[name: " + name + "]\n[Acct Number:" +accountNumber + "\n" + "[routing number :" +routingNumber + "]\n" + "balance is" + balance +"]\n";
}

}