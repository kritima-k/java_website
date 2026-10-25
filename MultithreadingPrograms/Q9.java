package multi_threading;

// This class is used to create a thread and perform a simple task
class my_thread extends Thread
{
String name;

// Constructor used to give a name to the thread
my_thread(String name)
{
this.name = name;
}

// The run() method contains the work performed by the thread
public void run()
{
// Printing the thread name five times
for(int i = 1; i <= 5; i++)
{
System.out.println(name + " - " + i);
}
}
}

// Main class used to create and start multiple threads
class thread
{
public static void main(String[] args)
{
// Creating three thread objects with different names
my_thread t1 = new my_thread("Thread 1");
my_thread t2 = new my_thread("Thread 2");
my_thread t3 = new my_thread("Thread 3");

// Starting all three threads
t1.start();
t2.start();
t3.start();

try
{
// Waiting for all three threads to complete their work
t1.join();
t2.join();
t3.join();
}
catch(Exception e)
{
// Displaying the exception if any problem occurs
System.out.println(e);
}

// Displaying a message after all threads have finished
System.out.println("All threads completed.");
}
}