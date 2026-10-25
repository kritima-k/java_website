package oops_programs;

import java.util.ArrayList;

class School
{
ArrayList<String> students = new ArrayList<>();
ArrayList<String> teachers = new ArrayList<>();
ArrayList<String> classes = new ArrayList<>();

// This method adds a new student to the school
void addStudent(String name)
{
students.add(name);

System.out.println(name + " added to school.");
}

// This method removes a student from the school
void removeStudent(String name)
{
if(students.remove(name))
{
System.out.println(name + " removed from school.");
}
else
{
System.out.println(name + " not found.");
}
}

// This method adds a new teacher to the school
void addTeacher(String name)
{
teachers.add(name);

System.out.println(name + " added as a teacher.");
}

// This method removes a teacher from the school
void removeTeacher(String name)
{
if(teachers.remove(name))
{
System.out.println(name + " removed from school.");
}
else
{
System.out.println(name + " not found.");
}
}

// This method creates a new class in the school
void createClass(String name)
{
classes.add(name);

System.out.println("Class " + name + " created.");
}

// This method shows all the students currently in the school
void displayStudents()
{
System.out.println("Students:");

for(String student : students)
{
System.out.println(student);
}
}

// This method shows all the teachers currently in the school
void displayTeachers()
{
System.out.println("Teachers:");

for(String teacher : teachers)
{
System.out.println(teacher);
}
}
}

class SchoolProgram
{
public static void main(String[] args)
{
// Create a School object
School school = new School();

// Add students
school.addStudent("Kritima");
school.addStudent("Megha");

// Add teachers
school.addTeacher("Ravi");
school.addTeacher("Neha");

// Create classes
school.createClass("BCA");
school.createClass("BBA");

// Display students and teachers
school.displayStudents();
school.displayTeachers();

// Remove a student and a teacher
school.removeStudent("Megha");
school.removeTeacher("Ravi");

// Display the updated lists
school.displayStudents();
school.displayTeachers();
}
}



