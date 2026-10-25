package inheritance;

// Parent1 has a variable called name
class Parent1 {
String name = "Parent Name";
}

// Child1 also has a variable called name, same name as parent's
class Child1 extends Parent1 {
String name = "Child Name";

void printNames() {
System.out.println(name); // this prints Child1's own name
System.out.println(super.name); // super lets us reach into the parent's name instead
}
}

 class SuperKeyword {
public static void main(String[] args) {
Child1 c = new Child1();
c.printNames();
}
}