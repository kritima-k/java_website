package additional_questions ;

class MyClass
{
synchronized void display()
{
System.out.println("Hello");
}
}

public class Q40
{
public static void main(String[] args)
{
MyClass obj = new MyClass();

Thread t1 = new Thread()
{
public void run()
{
obj.display();
}
};

Thread t2 = new Thread()
{
public void run()
{
obj.display();
}
};

t1.start();
t2.start();
}
}
