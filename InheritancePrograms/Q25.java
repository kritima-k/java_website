package inheritance;

// abstract class saying every bird must be able to fly and make a sound
abstract class Bird {
abstract void fly();
abstract void makeSound();
}

class Eagle extends Bird {
void fly() {
System.out.println("Eagle soars high in the sky.");
}

void makeSound() {
System.out.println("Eagle screeches.");
}
}

class Hawk extends Bird {
void fly() {
System.out.println("Hawk glides swiftly.");
}

void makeSound() {
System.out.println("Hawk makes a sharp cry.");
}
}

 class BirdFlySoundAbstract {
public static void main(String[] args) {
Eagle eagle = new Eagle();
Hawk hawk = new Hawk();

eagle.fly();
eagle.makeSound();

hawk.fly();
hawk.makeSound();
}
}