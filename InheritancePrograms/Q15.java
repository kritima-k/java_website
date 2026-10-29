package inheritance;

// abstract class cannot be used to create objects directly
// it just says "every animal must have a sound method" without saying what the sound is
abstract class AnimalAbstract {
abstract void sound(); // no body here, each subclass must fill this in
}

// Lion fills in what sound() actually does for a lion
class Lion extends AnimalAbstract 
{
void sound() {
System.out.println("Lion roars.");
}
}

// Tiger fills in what sound() actually does for a tiger
class Tiger extends AnimalAbstract 
{
void sound() {
System.out.println("Tiger growls.");
}
}

class AnimalSoundAbstract 
{
public static void main(String[] args) 
{
Lion lion = new Lion();
Tiger tiger = new Tiger();
lion.sound();
tiger.sound();
}
}