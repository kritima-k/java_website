package inheritance;

// abstract class saying every bank account must support deposit and withdraw
abstract class BankAccountAbstract {
double balance;

BankAccountAbstract(double balance) {
this.balance = balance;
}

abstract void deposit(double amount);
abstract void withdraw(double amount);
}

// SavingsAccount2 has a minimum balance rule when withdrawing
class SavingsAccount2 extends BankAccountAbstract {
SavingsAccount2(double balance) {
super(balance);
}

void deposit(double amount) {
balance += amount;
System.out.println("Savings deposit: " + amount);
}

void withdraw(double amount) {
if (balance - amount < 100) {
System.out.println("Cannot withdraw, minimum balance rule for savings");
} else {
balance -= amount;
System.out.println("Savings withdraw: " + amount);
}
}
}

// CurrentAccount has no minimum balance rule
class CurrentAccount extends BankAccountAbstract {
CurrentAccount(double balance) {
super(balance);
}

void deposit(double amount) {
balance += amount;
System.out.println("Current deposit: " + amount);
}

void withdraw(double amount) {
balance -= amount; // no restriction here unlike savings account
System.out.println("Current withdraw: " + amount);
}
}

 class BankAccounttAbstract {
public static void main(String[] args) {
SavingsAccount2 savings = new SavingsAccount2(500);
CurrentAccount current = new CurrentAccount(500);

savings.withdraw(450); // blocked, would go below 100
current.withdraw(450); // allowed, no restriction
}
}