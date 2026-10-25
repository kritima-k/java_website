package multi_threading;

// This class implements the Runnable interface and contains the task that will be performed by each thread
class my_thread implements Runnable
{
String name;

// Constructor used to give a different name to each thread
my_thread(String name)
{
this.name = name;
}

// The run() method contains the actual work performed by the thread
public void run()
{
// Printing the thread name and number five times
for(int i = 1; i <= 5; i++)
{
System.out.println(name + " - " + i);
}
}
}

// Main class used to create and start multiple threads
class runnable
{
public static void main(String[] args)
{
// Creating three Runnable objects with different thread names
my_thread r1 = new my_thread("Thread 1");
my_thread r2 = new my_thread("Thread 2");
my_thread r3 = new my_thread("Thread 3");

// Creating Thread objects and passing the Runnable objects to them
Thread t1 = new Thread(r1);
Thread t2 = new Thread(r2);
Thread t3 = new Thread(r3);

// Starting all three threads so they can execute concurrently
t1.start();
t2.start();
t3.start();

try
{
// Waiting for all three threads to finish their work
// before the main program continues
t1.join();
t2.join();
t3.join();
}
catch(Exception e)
{
// Displaying the exception if any problem occurs
System.out.println(e);
}

// Displaying a message after all threads have completed
System.out.println("All threads completed.");
}
}