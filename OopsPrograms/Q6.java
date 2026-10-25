package oops_programs;

// Program to calculate and update the salary of an employee

class Employee
{
// Attributes of Employee
String name;
String jobTitle;
double salary;

// Constructor to initialize employee details
Employee(String name, String jobTitle, double salary)
{
this.name = name;
this.jobTitle = jobTitle;
this.salary = salary;
}

// Method to calculate updated salary
double calculateSalary(double increment)
{
return salary + increment;
}

// Method to update the salary
void updateSalary(double increment)
{
salary = salary + increment;
}

// Main method
public static void main(String[] st)
{
// Create an Employee object using the constructor
Employee E = new Employee("Rahul", "Manager", 50000);

// Display the original salary
System.out.println("Employee Name: " + E.name);
System.out.println("Job Title: " + E.jobTitle);
System.out.println("Original Salary: " + E.salary);

// Calculate the updated salary
double newSalary = E.calculateSalary(5000);
System.out.println("Calculated Salary: " + newSalary);

// Update the salary
E.updateSalary(5000);

// Display the updated salary
System.out.println("Updated Salary: " + E.salary);
}
}