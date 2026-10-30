package additional_questions ;
class constr
{
String name ;
int age ;

 //default constructor 
constr()
{
name="anshika";
age=10;
}   
//parameterized constructor 
constr(String n , int a)
{
name = n;
age = a;
}
void display()
{
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}

public class Q12 
{
public static void main(String[] args)  
{
constr s1 = new constr();
constr s2 = new constr("vanshika",20);    
System.out.println("Default Constructor:");
s1.display();
System.out.println("Parameterized Constructor:");
s2.display();
}  
}


