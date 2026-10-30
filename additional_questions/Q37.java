package additional_questions ;

class myRunnable implements Runnable
{
public void run()
{
System.out.println("thread is working");
}
}

public class Q37
{
public static void main(String[] args)
{
myRunnable obj = new myRunnable();
Thread t1 = new Thread(obj);
t1.start();
}
}