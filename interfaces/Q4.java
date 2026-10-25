package interfaces;

import java.util.ArrayList;
import java.util.List;

// Account interface lists everything any type of bank account must be able to do
interface Account 
{
void deposit(double amount);
void withdraw(double amount);
void calculateInterest();
void viewBalance();
}

// SavingsAccount implements Account and adds its own interest logic
class SavingsAccount implements Account {
double balance;

SavingsAccount(double balance) {
this.balance = balance;
}

public void deposit(double amount) {
balance += amount;
System.out.println("Savings deposit: " + amount);
}

public void withdraw(double amount) {
balance -= amount;
System.out.println("Savings withdraw: " + amount);
}

// savings accounts earn interest, this adds it to the balance
public void calculateInterest() {
double interest = balance * 0.05;
balance += interest;
System.out.println("Interest added: " + interest);
}

public void viewBalance() {
System.out.println("Savings balance: " + balance);
}
}

// CurrentAccount implements Account but has no interest since it's for daily use
class CurrentAccount implements Account {
double balance;

CurrentAccount(double balance) {
this.balance = balance;
}

public void deposit(double amount) {
balance += amount;
System.out.println("Current deposit: " + amount);
}

public void withdraw(double amount) {
balance -= amount;
System.out.println("Current withdraw: " + amount);
}

// current accounts usually don't earn interest
public void calculateInterest() {
System.out.println("Current accounts do not earn interest.");
}

public void viewBalance() {
System.out.println("Current balance: " + balance);
}
}

// Bank keeps a list of accounts and can add more to it
class Bank {
List<Account> accounts = new ArrayList<>();

void addAccount(Account account) {
accounts.add(account);
}

// goes through every account in the bank and shows its balance
void showAllBalances() {
for (Account acc : accounts) {
acc.viewBalance();
}
}
}

 class BankingSystem{
public static void main(String[] args) {
Bank bank = new Bank();

SavingsAccount savings = new SavingsAccount(1000);
CurrentAccount current = new CurrentAccount(2000);

bank.addAccount(savings);
bank.addAccount(current);

savings.deposit(500);
savings.calculateInterest();

current.withdraw(300);
current.calculateInterest();

bank.showAllBalances();
}
}