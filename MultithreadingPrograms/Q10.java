package multi_threading;

// This class is used to create threads and perform a simple task
class my_thread extends Thread
{
// run() method contains the work performed by each thread
public void run()
{
// printing the name and priority of the current thread
for(int i = 1; i <= 5; i++)
{
System.out.println(Thread.currentThread().getName() + " - Priority: "
+ Thread.currentThread().getPriority());
}
}
}

// Main class used to create multiple threads
class thread_priority
{
public static void main(String[] args)
{
// creating three thread objects
my_thread t1 = new my_thread();
my_thread t2 = new my_thread();
my_thread t3 = new my_thread();

// setting different names for the threads
t1.setName("First Thread");
t2.setName("Second Thread");
t3.setName("Third Thread");

// setting different priorities for the threads
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY);
t3.setPriority(Thread.MAX_PRIORITY);

// displaying the name and priority of each thread
System.out.println(t1.getName() + " Priority: " + t1.getPriority());
System.out.println(t2.getName() + " Priority: " + t2.getPriority());
System.out.println(t3.getName() + " Priority: " + t3.getPriority());

// starting all three threads
t1.start();
t2.start();
t3.start();

try
{
// waiting for all three threads to finish
t1.join();
t2.join();
t3.join();
}
catch(Exception e)
{
// displaying the exception if any problem occurs
System.out.println(e);
}

System.out.println("All threads completed.");
}
}