package additional_questions;
class student 
{
String name = "vanshika";
int age = 20;

void display()
{
System.out.println("name is "+name);
System.out.println("age is "+age);    
}
}

public class Q10 
{
public static void main(String[] st)    
{
//creating objects 
student s = new student();
s.display();    
}
}