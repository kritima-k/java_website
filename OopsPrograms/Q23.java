
package oops_programs;

import java.util.Scanner;

// This class stores student details
class Student
{
int rollno;
String name;
String studentClass;

// This constructor assigns the details
Student(int r, String n, String c)
{
rollno = r;
name = n;
studentClass = c;
}

// This method displays student details
void display()
{
System.out.println("Roll Number: " + rollno);
System.out.println("Name: " + name);
System.out.println("Class: " + studentClass);
System.out.println();
}
}


class StudentRecord
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// Create an array for 10 students
Student[] students = new Student[10];

// Enter details of 10 students using for loop
for(int i = 0; i < 10; i++)
{
System.out.println("Enter details of Student " + (i + 1));
 
//  this Generate roll number automatically
int rollno = i + 1;

System.out.print("Enter name: ");
String name = sc.nextLine();

System.out.print("Enter class: ");
String studentClass = sc.nextLine();

// Creating student object
students[i] = new Student(rollno, name, studentClass);
}

// Display all student details
System.out.println("Student Records");

for(int i = 0; i < 10; i++)
{
students[i].display();
}

sc.close();
}
}

