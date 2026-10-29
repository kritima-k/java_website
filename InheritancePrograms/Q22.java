package inheritance;

// abstract class 
abstract class PersonAbstract 
{
abstract void eat();
abstract void exercise();
}

class Athlete extends PersonAbstract 
{
void eat() 
{
System.out.println("Athlete eats a high protein diet.");
}

void exercise() 
{
System.out.println("Athlete trains for hours daily.");
}
}

class LazyPerson extends PersonAbstract 
{
void eat()
 {
System.out.println("Lazy person eats junk food.");
}

void exercise() 
{
System.out.println("Lazy person avoids exercise.");
}
}

 class PersonEatExerciseAbstract 
 {
public static void main(String[] args) 
{
Athlete athlete = new Athlete();
LazyPerson lazy = new LazyPerson();

athlete.eat();
athlete.exercise();

lazy.eat();
lazy.exercise();
}
}