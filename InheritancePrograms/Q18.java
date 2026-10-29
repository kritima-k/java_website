package inheritance;

// abstract class saying every animal mustt have eat and sleep method 
abstract class AnimalAbstract2 
{
abstract void eat();
abstract void sleep();
}

// each animal below fills in eat and sleep in its own way
class Lion2 extends AnimalAbstract2 
{
void eat() 
{
System.out.println("Lion eats meat.");
}

void sleep() 
{
System.out.println("Lion sleeps 20 hours a day.");
}
}

class Tiger2 extends AnimalAbstract2 
{
void eat() 
{
System.out.println("Tiger eats meat too.");
}

void sleep() 
{
System.out.println("Tiger sleeps in the shade.");
}
}

class Deer extends AnimalAbstract2 
{
void eat() 
{
System.out.println("Deer eats grass.");
}

void sleep() 
{
System.out.println("Deer sleeps lightly, stays alert.");
}
}

class AnimalEatSleepAbstract
{
public static void main(String[] args) 
{
Lion2 lion = new Lion2();
Tiger2 tiger = new Tiger2();
Deer deer = new Deer();

lion.eat();
lion.sleep();

tiger.eat();
tiger.sleep();

deer.eat();
deer.sleep();
}
}