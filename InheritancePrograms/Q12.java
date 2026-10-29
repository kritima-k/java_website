package inheritance;

// Parent2 has a normal show method
class Parent2 
{
void show() 
{
System.out.println("This is parent method.");
}
}

// Child2 overrides show but still wants to run the parent's version too
class Child2 extends Parent2 
{
void show() 
{
super.show(); // this runs Parent2's show first
System.out.println("This is child method."); // then this runs after
}
}

 class SuperMethodCall 
 {
public static void main(String[] args) 
{
Child2 c = new Child2();
c.show(); // prints both parent's and child's messages
}
}