package oops_programs;

// This class stores employee details
class Employee
{
private int employee_id;
private String employee_name;
private double employee_salary;

// Setter methods for ID and name
public void setEmployeeId(int id)
{
employee_id = id;
}

public void setEmployeeName(String name)
{
employee_name = name;
}

// Getter methods for ID and name
public int getEmployeeId()
{
return employee_id;
}

public String getEmployeeName()
{
return employee_name;
}

// Getter returns salary as a formatted string
public String getEmployeeSalary()
{
return String.format("%.2f", employee_salary);
}

// Constructor to assign salary
Employee(double salary)
{
employee_salary = salary;
}
}

class EmployeeProgram
{
public static void main(String[] args)
{
Employee e = new Employee(35000.5);

e.setEmployeeId(101);
e.setEmployeeName("Kritima");

System.out.println("Employee ID: " + e.getEmployeeId());
System.out.println("Employee Name: " + e.getEmployeeName());
System.out.println("Employee Salary: " + e.getEmployeeSalary());
}
}

