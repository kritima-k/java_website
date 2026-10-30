package mypack;
// Program to create multiple default classes
class Student
{
void display()
{
System.out.println("This is first class");
}
}

class Teacher
{
void show()
{
System.out.println("This is student class");
}
}

class Q5
{
public static void main(String[] args)
{
// creating objects
Student s = new Student();
Teacher t = new Teacher();
// calling methods
s.display();
t.show();
}
}