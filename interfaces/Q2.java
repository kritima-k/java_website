package interfaces;

// Animal interface says any class implementing it must have a bark method
interface Animal
{
void bark(); // takes nothing, returns nothing
}

// Dog implements Animal and fills in what bark actually does
class Dog implements Animal 
{
public void bark() 
{
System.out.println("Dog is barking");
}
}

 class AnimalInterfaceDemo {
public static void main(String[] args) {
Dog myDog = new Dog();
myDog.bark();
}
}