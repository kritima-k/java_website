
package oops_programs;

import java.util.ArrayList;

// This class stores student details and grades
class Student
{
private int student_id;
private String student_name;
private ArrayList<Integer> grades;

// Constructor
Student()
{
grades = new ArrayList<Integer>();
}

// Setter methods
public void setStudentId(int id)
{
student_id = id;
}

public void setStudentName(String name)
{
student_name = name;
}

// Getter methods
public int getStudentId()
{
return student_id;
}

public String getStudentName()
{
return student_name;
}

// Add grade after validation
public void addGrade(int grade)
{
if(grade >= 0 && grade <= 100)
{
grades.add(grade);
System.out.println("Grade added successfully.");
}
else
{
System.out.println("Invalid grade. Enter 0 to 100.");
}
}

// Display student details and grades
public void display()
{
System.out.println("Student ID: " + student_id);
System.out.println("Student Name: " + student_name);
System.out.println("Grades: " + grades);
}
}

class StudentGradeProgram
{
public static void main(String[] args)
{
Student s = new Student();

s.setStudentId(101);
s.setStudentName("Kritima");

s.addGrade(85);
s.addGrade(92);
s.addGrade(120);

s.display();
}
}

