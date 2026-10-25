package inheritance;

// Animal2 is the parent class with a general move method
class Animal2 {
void move() {
System.out.println("The animal moves.");
}
}

// Cheetah extends Animal2 and changes how it moves
class Cheetah extends Animal2 {
// overriding move to describe how a cheetah specifically moves
void move() {
System.out.println("The cheetah runs fast.");
}
}

 class AnimalMoveOverride {
public static void main(String[] args) {
Cheetah myCheetah = new Cheetah();
myCheetah.move(); // uses Cheetah's version, not Animal2's
}
}