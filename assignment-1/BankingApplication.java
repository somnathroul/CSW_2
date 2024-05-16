package Assignment2;
abstract class Account{
private String accountNumber;
private double balance;

abstract void deposit(double amount);
abstract void withdraw(double amount);

public String getAccountNumber() {
return accountNumber;
}

public void setAccountNumber(String accountNumber) {
this.accountNumber = accountNumber;
}

public double getBalance() {
return balance;
}

public void setBalance(double balance) {
this.balance = balance;
}

}
class SavingsAccount extends Account{

private double interestRate;

public double getInterestRate() {
return interestRate;
}

public void setInterestRate(double interestRate) {
this.interestRate = interestRate;
}

@Override
void deposit(double amount) {
if(amount == 0) System.out.println("The amount can't be zero(0)");
else {
System.out.println(amount+"Rs. is credited to your bank.");
double cuurentBalance = this.getBalance();
cuurentBalance += amount;
this.setBalance(cuurentBalance);
System.out.println("Balance is updated : Rs."+cuurentBalance);
}
}

@Override
void withdraw(double amount) {
if(amount == 0) System.out.println("The amount can't be zero(0)");
else if(amount > this.getBalance()) System.out.println("Insufficent Balance");
else {
System.out.println(amount+"Rs. is debited to your bank.");
double cuurentBalance = this.getBalance();
cuurentBalance -= amount;
this.setBalance(cuurentBalance);
System.out.println("Balance is updated : Rs."+cuurentBalance);
}
}
public void Interest() {
if(this.getBalance() > 0) System.out.println("Insufficent Balance");
else {
double interest = (this.getBalance() * 1 * this.interestRate) / 100;
System.out.println("Interest rate is : "+interest);
}
}
}
class CurrentAccount extends Account{

 double overdraftLimit;

public double getOverdraftLimit() {
return overdraftLimit;
}

public void setOverdraftLimit(double overdraftLimit) {
this.overdraftLimit = overdraftLimit;
}

@Override
void deposit(double amount) {
if(amount == 0) System.out.println("The amount can't be zero(0)");
else {
System.out.println(amount+"Rs. is credited to your bank.");
double cuurentBalance = this.getBalance();
cuurentBalance += amount;
this.setBalance(cuurentBalance);
System.out.println("Balance is updated : Rs."+cuurentBalance);
}
}

@Override
void withdraw(double amount) {
if(amount == 0) System.out.println("The amount can't be zero(0)");
else if(amount > this.getBalance()) System.out.println("Insufficent Balance");
else if(this.overdraftLimit < amount) System.out.println("Can't be withdraw now");
else {
System.out.println(amount+"Rs. is debited to your bank.");
double cuurentBalance = this.getBalance();
cuurentBalance -= amount;
this.setBalance(cuurentBalance);
System.out.println("Balance is updated : Rs."+cuurentBalance);
}
}

}
public class BankingApplication {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount S = new SavingsAccount();
		S.deposit(18000);
		S.withdraw(3000);
		S.setInterestRate(11);
		S.Interest();
		CurrentAccount C = new CurrentAccount();
		C.deposit(20000);
		C.setOverdraftLimit(300);
		C.withdraw(2000);
		}

}
