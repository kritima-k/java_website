package oops_programs;

// This class stores student details
class Student
{
String name;
int age;

// Parameterized constructor
// It assigns values to name and age
Student(String name, int age)
{
this.name = name;
this.age = age;
}

// Copy constructor
// It copies details from another Student object
Student(Student s)
{
name = s.name;
age = s.age;
}

// This method displays student details
void display()
{
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}

// This is where the program starts running
class Copy_cons
{
public static void main(String[] args)
{
// Create the first student object
Student s1 = new Student("Kritima", 21);

// Create the second object by copying the first object
Student s2 = new Student(s1);

// Display the details of both students
System.out.println("First Student:");
s1.display();

System.out.println();

System.out.println("Copied Student:");
s2.display();
}
}

