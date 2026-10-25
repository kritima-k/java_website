package multi_threading;

// class containing the method that will be shared by multiple threads
class display
{
// synchronized method allows only one thread at a time
// to execute this method for the same object
synchronized void show(String name)
{
// displaying the name five times
for(int i = 1; i <= 5; i++)
{
System.out.println(name + " - " + i);
}
}
}

// thread used to call the synchronized method
class first_thread extends Thread
{
display d;

// constructor to receive the display object
first_thread(display d)
{
this.d = d;
}

// run method calls the synchronized method
public void run()
{
d.show("First Thread");
}
}

// another thread used to call the same synchronized method
class second_thread extends Thread
{
display d;

// constructor to receive the same display object
second_thread(display d)
{
this.d = d;
}

// run method calls the synchronized method
public void run()
{
d.show("Second Thread");
}
}

// main class
class synchronization
{
public static void main(String[] args)
{
// creating one display object shared by both threads
display d = new display();

// creating two threads using the same display object
first_thread t1 = new first_thread(d);
second_thread t2 = new second_thread(d);

// starting both threads
t1.start();
t2.start();

try
{
// waiting for both threads to complete
t1.join();
t2.join();
}
catch(Exception e)
{
System.out.println(e);
}

// displaying completion message
System.out.println("Both threads completed.");
}
}