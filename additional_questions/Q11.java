package additional_questions ;

class students
{
String name = "kritima";
int age =19;
void display()
{
System.out.println("name is "+name);
System.out.println("age is"+age);    
}
}
public class Q11 
{
public static void main(String[] st)
{
students s = new students();
System.out.println("Student Name: " + s.name);
System.out.println("Student Age: " + s.age);    

}    
}