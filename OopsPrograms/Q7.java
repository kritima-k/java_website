package oops_programs;

// Program to manage bank accounts and perform deposit and withdrawal operations

class Account
{
// Attributes of Account
String accountNumber;
String customerName;
double balance;

// Constructor to initialize account details
Account(String accountNumber, String customerName, double balance)
{
this.accountNumber = accountNumber;
this.customerName = customerName;
this.balance = balance;
}

// Method to deposit money
void deposit(double amount)
{
balance = balance + amount;
}

// Method to withdraw money
void withdraw(double amount)
{
if(amount <= balance)
{
balance = balance - amount;
}
else
{
System.out.println("Insufficient balance");
}
}

// Method to display account details
void displayAccount()
{
System.out.println("Account Number: " + accountNumber);
System.out.println("Customer Name: " + customerName);
System.out.println("Balance: " + balance);
}
}


class Bank
{
// Array to store bank accounts
Account[] accounts = new Account[10];

// Variable to keep track of number of accounts
int count = 0;

// Method to add an account
void addAccount(Account account)
{
accounts[count] = account;
count++;
}

// Method to remove an account using account number
void removeAccount(String accountNumber)
{
for(int i = 0; i < count; i++)
{
if(accounts[i].accountNumber.equals(accountNumber))
{
for(int j = i; j < count - 1; j++)
{
accounts[j] = accounts[j + 1];
}

accounts[count - 1] = null;
count--;

System.out.println("Account removed successfully");
break;
}
}
}

// Main method
public static void main(String[] st)
{
// Create a Bank object
Bank bank = new Bank();

// Create two Account objects
Account A1 = new Account("101", "Vanshika", 5000);
Account A2 = new Account("102", "Sanjana", 7000);

// Add accounts to the bank
bank.addAccount(A1);
bank.addAccount(A2);

// Display account details
System.out.println("Account Details:");
A1.displayAccount();
System.out.println();
A2.displayAccount();

// Deposit money into first account
A1.deposit(2000);

// Withdraw money from second account
A2.withdraw(1000);

// Display updated balances
System.out.println();
System.out.println("Updated Account Details:");
A1.displayAccount();
System.out.println();
A2.displayAccount();

// Remove the second account
bank.removeAccount("102");
}
}