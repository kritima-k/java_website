package oops_programs;

// Program to add and remove courses of a student

class Student
{
// Attributes of Student
String name;
char grade;
String[] courses;
int count;

// Constructor to initialize student details
Student(String name, char grade)
{
this.name = name;
this.grade = grade;
courses = new String[5];
count = 0;
}

// Method to add a course
void addCourse(String course)
{
courses[count] = course;
count++;
}

// Method to remove a course
void removeCourse(String course)
{
for(int i = 0; i < count; i++)
{
if(courses[i].equals(course))
{
for(int j = i; j < count - 1; j++)
{
courses[j] = courses[j + 1];
}

courses[count - 1] = null;
count--;
break;
}
}
}

// Method to display student details
void displayStudent()
{
System.out.println("Name: " + name);
System.out.println("Grade: " + grade);
System.out.println("Courses:");

for(int i = 0; i < count; i++)
{
System.out.println(courses[i]);
}
}

// Main method
public static void main(String[] st)
{
// Create a Student object
Student S = new Student("Vanshika", 'A');

// Add courses
S.addCourse("Java");
S.addCourse("Python");
S.addCourse("Database");

// Display details after adding courses
System.out.println("Student Details:");
S.displayStudent();

// Remove a course
S.removeCourse("Python");

// Display details after removing a course
System.out.println();
System.out.println("After Removing Python:");
S.displayStudent();
}
}