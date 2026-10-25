
package oops_programs;

// This class stores student details
class Student
{
String name;
int age;

// Default constructor initializes student details
Student()
{
name = "hello ";
age = 10;

System.out.println("Default constructor called");
}

// This method displays student details
void display()
{
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}

// This is where the program starts running
class Def_cons
{
public static void main(String[] args)
{
// Create a Student object
// The constructor is called automatically
Student s1 = new Student();

// Display student details
s1.display();
}
}

