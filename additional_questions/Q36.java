package additional_questions ;

class myThread extends Thread
{
public void run()
{
System.out.println("thread is working");
}
}

public class Q36
{
public static void main(String[] args)
{
myThread t1 = new myThread();
t1.start();
}
}




