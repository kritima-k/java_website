package additional_questions ;
class Animal
{
void eat()
{
System.out.println("Animal is eating");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("Dog is barking");
}
}

class Puppy extends Dog
{
void cry()
{
System.out.println("Puppy is crying");
}
}

public class Q27
{
public static void main(String[] args)
{
Puppy p = new Puppy();
p.eat();
p.bark();
p.cry();
}
}


