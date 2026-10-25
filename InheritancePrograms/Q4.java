package inheritance;

// Employee is the parent class with basic work and salary info
class Employee {
void work() {
System.out.println("Employee is working.");
}

void getSalary() {
System.out.println("Employee gets a salary.");
}
}

// HRManager extends Employee, so it can do everything Employee does, plus more
class HRManager extends Employee {
// overriding work to describe what an HR manager specifically does
void work() {
System.out.println("HR Manager is managing staff.");
}

// this is a brand new method, only HRManager has it, Employee does not
void addEmployee() {
System.out.println("New employee added.");
}
}

 class EmployeeHRManager {
public static void main(String[] args) {
HRManager hr = new HRManager(); // creating an HRManager object
hr.work(); // runs HRManager's own version
hr.getSalary(); // this comes from Employee since HRManager didn't change it
hr.addEmployee(); // this method only exists in HRManager
}
}