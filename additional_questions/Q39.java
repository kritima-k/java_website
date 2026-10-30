package additional_questions ;

class myThread extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName() + " is running");
}
}

public class Q39
{
public static void main(String[] args)
{
myThread t1 = new myThread();
myThread t2 = new myThread();
myThread t3 = new myThread();

t1.setPriority(3);
t2.setPriority(5);
t3.setPriority(8);

t1.start();
t2.start();
t3.start();
}
}
