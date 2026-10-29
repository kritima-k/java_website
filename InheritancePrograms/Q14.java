package inheritance;

class Parent4 
{
void display() 
{
System.out.println("Parent display");
}
}

class Child4 extends Parent4
{
void display() {
System.out.println("Child display");
}
}

 class DynamicMethodDispatch 
 {
public static void main(String[] args) 
{
// the variable type is Parent4, but the actual object is Child4
Parent4 obj = new Child4();

// java looks at the actual object (Child4), not the variable type, to decide which method to run
obj.display(); // this prints Child display
}
}