package oops_programs;

// This class stores student details
class Student
{
String name;
int age;

// Parameterized constructor
Student(String n, int a)
{
name = n;
age = a;
}

// This method displays student details
void display()
{
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}

// This is where the program starts running
class Para_cons
{
public static void main(String[] args)
{
// Create two students with different values
Student s1 = new Student("vanshika", 21);
Student s2 = new Student("sanjana", 20);

// Display the details of both students
s1.display();

System.out.println();

s2.display();
}
}

