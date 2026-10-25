package inheritance;

// BankAccount is the parent class that keeps track of a balance
class BankAccount {
double balance;

// constructor sets the starting balance when account is created
BankAccount(double balance) {
this.balance = balance;
}

void deposit(double amount) {
balance = balance + amount;
System.out.println("Deposited: " + amount);
}

void withdraw(double amount) {
balance = balance - amount;
System.out.println("Withdrew: " + amount);
}
}

// SavingsAccount extends BankAccount but adds a rule for withdrawing
class SavingsAccount extends BankAccount {
SavingsAccount(double balance) {
super(balance); // this calls BankAccount's constructor to set the balance
}

// overriding withdraw to block withdrawals that would drop balance below 100
void withdraw(double amount) {
if (balance - amount < 100) {
System.out.println("Cannot withdraw, balance would go below 100");
} else {
balance = balance - amount;
System.out.println("Withdrew: " + amount);
}
}
}

class BankAccountWithdrawLimit {
public static void main(String[] args) {
SavingsAccount account = new SavingsAccount(500); // starting balance is 500
account.withdraw(450); // this should be blocked, balance would go below 100
account.withdraw(300); // this should work fine
}
}