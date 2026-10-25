package multi_threading;

// class used to create threads and demonstrate yield()
class my_thread extends Thread
{
// constructor to give a name to the thread
my_thread(String name)
{
setName(name);
}

// run method contains the work performed by the thread
public void run()
{
// printing the thread name and numbers
for(int i = 1; i <= 5; i++)
{
System.out.println(getName() + " - " + i);

// giving other threads a chance to execute
Thread.yield();
}
}
}

// main class to demonstrate join()
class join_yield
{
public static void main(String[] args)
{
// creating three thread objects
my_thread t1 = new my_thread("Thread 1");
my_thread t2 = new my_thread("Thread 2");
my_thread t3 = new my_thread("Thread 3");

// starting the first thread
t1.start();

try
{
// waiting for the first thread to finish
t1.join();
}
catch(Exception e)
{
System.out.println(e);
}

// starting the remaining threads after t1 finishes
t2.start();
t3.start();

try
{
// waiting for both threads to finish
t2.join();
t3.join();
}
catch(Exception e)
{
System.out.println(e);
}

// displaying completion message
System.out.println("All threads completed.");
}
}