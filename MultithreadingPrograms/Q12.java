package multi_threading;

// class used to demonstrate different thread methods
class thread_methods
{
boolean ready = false;

// method to demonstrate wait() and notify()
synchronized void waiting_thread()
{
try
{
// thread waits until another thread calls notify()
System.out.println("Thread is waiting");
wait();

// thread continues after being notified
System.out.println("Thread resumed after notify()");
}
catch(Exception e)
{
System.out.println(e);
}
}

// method to demonstrate notify()
synchronized void wake_thread()
{
// changing the condition before notifying the waiting thread
ready = true;

// notifying one waiting thread
notify();

System.out.println("Notify called");
}

// method to demonstrate notifyAll()
synchronized void wake_all()
{
// waking all threads that are waiting on this object
notifyAll();

System.out.println("NotifyAll called");
}
}

// thread that waits for notification
class wait_thread extends Thread
{
thread_methods obj;

// constructor to receive the shared object
wait_thread(thread_methods obj)
{
this.obj = obj;
}

// run method makes the thread wait
public void run()
{
obj.waiting_thread();
}
}

// thread used to demonstrate sleep()
class sleep_thread extends Thread
{
public void run()
{
try
{
// pausing the thread for 1000 milliseconds
System.out.println("Thread is sleeping");
Thread.sleep(1000);

// thread continues after sleeping
System.out.println("Thread woke up after sleep()");
}
catch(Exception e)
{
System.out.println(e);
}
}
}

// thread used to demonstrate notifyAll()
class notify_thread extends Thread
{
thread_methods obj;

// constructor to receive the shared object
notify_thread(thread_methods obj)
{
this.obj = obj;
}

// run method waits for notification
public void run()
{
synchronized(obj)
{
try
{
// waiting for notifyAll()
System.out.println("Waiting for notifyAll");
obj.wait();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}

// main class
class thread_methods_demo
{
public static void main(String[] args)
{
thread_methods obj = new thread_methods();

// creating a thread for wait() and notify()
wait_thread t1 = new wait_thread(obj);

// creating a thread to demonstrate sleep()
sleep_thread t2 = new sleep_thread();

// creating two threads to demonstrate notifyAll()
notify_thread t3 = new notify_thread(obj);
notify_thread t4 = new notify_thread(obj);

// starting the waiting thread
t1.start();

try
{
// giving t1 some time to enter the waiting state
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}

// notifying the waiting thread
synchronized(obj)
{
obj.wake_thread();
}

// starting the sleep thread
t2.start();

// starting two threads that will wait for notifyAll()
t3.start();
t4.start();

try
{
// giving t3 and t4 some time to enter the waiting state
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}

// waking all waiting threads
synchronized(obj)
{
obj.wake_all();
}

try
{
// waiting for all threads to complete
t1.join();
t2.join();
t3.join();
t4.join();
}
catch(Exception e)
{
System.out.println(e);
}

System.out.println("All threads completed.");
}
}