package inheritance;

// Animal is the parent class, it has a basic sound method
class Animal {
void makeSound() {
System.out.println("The animal makes a sound.");
}
}

// Cat extends Animal, meaning it inherits everything Animal has
class Cat extends Animal {
// this replaces (overrides) the parent's makeSound with Cat's own version
void makeSound() {
System.out.println("The cat barks.");
}
}

 class AnimalSoundOverride{
public static void main(String[] args) {
Cat myCat = new Cat(); // creating a Cat object
myCat.makeSound(); // this runs Cat version not Animal because of overriding
}
}