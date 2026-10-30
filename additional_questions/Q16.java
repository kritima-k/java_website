package additional_questions;

class Parent
{
final int age = 19;
final void display()
{
System.out.println("Final method called");
}
}

// Final class
final class FinalClass
{
void show()
{
System.out.println("Final class created");
}
}
public class Q16
{
public static void main(String[] args)
{
Parent p = new Parent();
System.out.println("Age: " + p.age);
//  Cannot assign a value to a final variable
p.age = 20;
//  Cannot override a final method
class Child extends Parent
{
void display()
{
System.out.println("Overridden method");
}
}
class AnotherClass extends FinalClass
{
}
}
}

