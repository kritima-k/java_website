package inheritance;

// Parent3 has a greet method
class Parent3 {
void greet() {
System.out.println("Hello from parent.");
}
}

// Child3 overrides greet with its own version
class Child3 extends Parent3 {
// overriding means giving a new version of a method that already exists in the parent
void greet() {
System.out.println("Hello from child.");
}
}

 class MethodOverriding {
public static void main(String[] args) {
Child3 c = new Child3();
c.greet(); // prints child's version because it overrides the parent's
}
}