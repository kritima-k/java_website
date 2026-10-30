package additional_questions ;

class Parent1
{
void display()
{
System.out.println("Parent class");
}
}

class Child extends Parent1
{
void show()
{
super.display();
}
}

public class Q31
{
public static void main(String[] args)
{
Child c = new Child();
c.show();
}
}
