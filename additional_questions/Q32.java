package additional_questions ;

class Student
{
public int a = 10;
private int b = 20;
protected int c = 30;

public void display()
{
System.out.println("Private variable: " + b);
}
}

public class Q32
{
public static void main(String[] args)
{
Student s = new Student();

System.out.println("Public variable: " + s.a);

s.display();

System.out.println("Protected variable: " + s.c);
System.out.println("Private variable: " + s.b);
}
}
