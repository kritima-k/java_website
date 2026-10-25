package multi_threading;

// class for creating a bank account and managing its balance
class bank_account
{
int balance = 1000;

// synchronized method is used so that only one thread
// can change the account balance at a time
synchronized void deposit(int amount)
{
// adding the deposited amount to the current balance
balance = balance + amount;

System.out.println("Deposited: " + amount);
System.out.println("Balance after deposit: " + balance);
}

// synchronized method for withdrawing money from the account
synchronized void withdraw(int amount)
{
// checking if the account has enough money for withdrawal
if(balance >= amount)
{
// subtracting the withdrawal amount from the balance
balance = balance - amount;

System.out.println("Withdrawn: " + amount);
System.out.println("Balance after withdrawal: " + balance);
}
else
{
// displaying this message when the balance is not enough
System.out.println("Insufficient balance");
}
}
}

// thread used to perform the deposit operation
class deposit_thread extends Thread
{
bank_account account;

// constructor to connect this thread with the bank account
deposit_thread(bank_account account)
{
this.account = account;
}

// run method performs the deposit when the thread starts
public void run()
{
account.deposit(500);
}
}

// thread used to perform the withdrawal operation
class withdraw_thread extends Thread
{
bank_account account;

// constructor to connect this thread with the bank account
withdraw_thread(bank_account account)
{
this.account = account;
}

// run method performs the withdrawal when the thread starts
public void run()
{
account.withdraw(300);
}
}

// main class used to create and start both threads
class bank
{
public static void main(String[] args)
{
// creating one bank account with an initial balance of 1000
bank_account account = new bank_account();

// creating a thread for depositing money
deposit_thread t1 = new deposit_thread(account);

// creating another thread for withdrawing money
withdraw_thread t2 = new withdraw_thread(account);

// starting both threads to perform their operations
t1.start();
t2.start();

try
{
// waiting for both threads to complete their operations
t1.join();
t2.join();
}
catch(Exception e)
{
System.out.println(e);
}

// displaying the balance left after both operations
System.out.println("Final balance: " + account.balance);
}
}