package additional_questions;

class const_overloading
{
String name;
int age;
// No argument constructor
const_overloading()
{
name = "kritima";
age = 19;
}
// One argument constructor
const_overloading(String n)
{
name = n;
age = 18;
}
// Two argument constructor
const_overloading(String n, int a)
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
public class Q13
{
public static void main(String[] st)
{
const_overloading co1 = new const_overloading();
const_overloading co2 = new const_overloading("kritima");
const_overloading co3 = new const_overloading("kritima", 19);
co1.display();
co2.display();
co3.display();
}
}