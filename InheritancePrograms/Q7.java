package inheritance;

// Person is the parent class storing a first and last name
class Person 
{
String firstName;
String lastName;

Person(String firstName, String lastName) 
{
this.firstName = firstName;
this.lastName = lastName;
}

String getFirstName()
{
return firstName;
}

String getLastName()
{
return lastName;
}
}

// EmployeePerson extends Person and adds employee-specific details
class EmployeePerson extends Person 
{
int employeeId;
String jobTitle;

// constructor sets up both the inherited fields and the new ones
EmployeePerson(String firstName, String lastName, int employeeId, String jobTitle) 
{
super(firstName, lastName); // sets first and last name using Person constructor
this.employeeId = employeeId;
this.jobTitle = jobTitle;
}

// new method only EmployeePerson has this
int getEmployeeId() 
{
return employeeId;
}

// overriding getLastName so it also shows the job title
String getLastName() 
{
return lastName + " (" + jobTitle + ")";
}
}
 class PersonEmployeeOverride 
{
public static void main(String[] args) 
{
EmployeePerson emp = new EmployeePerson("sanjana", "vanshika", 101, "Manager");
System.out.println(emp.getFirstName()); 
System.out.println(emp.getLastName()); 
System.out.println(emp.getEmployeeId()); 
}
}