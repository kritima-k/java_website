package inheritance;

// abstract class saying every employee must calculate salary and show info
abstract class EmployeeAbstract {
String name;

EmployeeAbstract(String name) {
this.name = name;
}

abstract double calculateSalary();
abstract void displayInfo();
}

// Manager2 gets extra money on top of base salary
class Manager2 extends EmployeeAbstract {
double baseSalary;

Manager2(String name, double baseSalary) {
super(name);
this.baseSalary = baseSalary;
}

double calculateSalary() {
return baseSalary + 10000; // manager gets a fixed extra allowance
}

void displayInfo() {
System.out.println("Manager: " + name + ", Salary: " + calculateSalary());
}
}

// Programmer2 just gets their base salary, no extra
class Programmer2 extends EmployeeAbstract {
double baseSalary;

Programmer2(String name, double baseSalary) {
super(name);
this.baseSalary = baseSalary;
}

double calculateSalary() {
return baseSalary;
}

void displayInfo() {
System.out.println("Programmer: " + name + ", Salary: " + calculateSalary());
}
}

 class EmployeeSalaryAbstract {
public static void main(String[] args) {
Manager2 mgr = new Manager2("Ravi", 50000);
Programmer2 prog = new Programmer2("Aman", 40000);

mgr.displayInfo();
prog.displayInfo();
}
}