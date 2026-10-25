package oops_programs;

// This class stores bank account details
class BankAccount
{
private String accountNumber;
private double balance;

// Setter methods
public void setAccountNumber(String a)
{
accountNumber = a;
}

public void setBalance(double b)
{
balance = b;
}

// Getter methods
public String getAccountNumber()
{
return accountNumber;
}

public double getBalance()
{
return balance;
}
}

class BankAccountProgram
{
public static void main(String[] args)
{
BankAccount b = new BankAccount();

b.setAccountNumber("1234567890");
b.setBalance(5000);

System.out.println("Account Number: " + b.getAccountNumber());
System.out.println("Balance: " + b.getBalance());
}
}

