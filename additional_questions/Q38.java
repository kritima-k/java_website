package additional_questions ;

class myThread extends Thread
{
String name;

myThread(String name)
{
this.name = name;
}

public void run()
{
for(int i = 1; i <= 5; i++)
{
System.out.println(name + " " + i);
}
}
}

public class Q38
{
public static void main(String[] args)
{
myThread t1 = new myThread("Thread 1");
myThread t2 = new myThread("Thread 2");

t1.start();
t2.start();
}
}
