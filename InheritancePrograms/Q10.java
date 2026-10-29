package inheritance;

// Employee2 is the parent class holding info shared by all employees
class Employee2 
{
String name;
String address;
double salary;
String jobTitle;

Employee2(String name, String address, double salary, String jobTitle) 
{
this.name = name;
this.address = address;
this.salary = salary;
this.jobTitle = jobTitle;
}

double calculateBonus() 
{
return 0;
}

void generateReport() 
{
System.out.println(name + " - " + jobTitle + " - Salary: " + salary);
}
}


class Manager extends Employee2 
{
Manager(String name, String address, double salary) 
{
super(name, address, salary, "Manager"); 
}

double calculateBonus()
{
return salary * 0.2;
}


void manageProject(String projectName) 
{
System.out.println(name + " is managing project: " + projectName);
}
}

// Developer extends Employee2 with a smaller bonus percentage
class Developer extends Employee2
{
Developer(String name, String address, double salary) 
{
super(name, address, salary, "Developer");
}

double calculateBonus() 
{
return salary * 0.15;
}
}

// Programmer extends Employee2 with the smallest bonus percentage
class Programmer extends Employee2 
{
Programmer(String name, String address, double salary) 
{
super(name, address, salary, "Programmer");
}

double calculateBonus() 
{
return salary * 0.1;
}
}

 class EmployeeHierarchy 
 {
public static void main(String[] args) 
{
Manager mgr = new Manager("Ravi", "Chandigarh", 60000);
Developer dev = new Developer("Simran", "Ludhiana", 50000);
Programmer prog = new Programmer("Aman", "Mohali", 40000);

mgr.generateReport();
System.out.println("Bonus: " + mgr.calculateBonus());
mgr.manageProject("Website Redesign");

dev.generateReport();
System.out.println("Bonus: " + dev.calculateBonus());

prog.generateReport();
System.out.println("Bonus: " + prog.calculateBonus());
}
}