package inheritance;
abstract class PersonAbstract
{
abstract void eat();
abstract void exercise();
}
class Athlete extends PersonAbstract
{
void eat()
{
System.out.println("Eating rice.");
}

void exercise()
{
System.out.println("Running daily.");
}
}
class LazyPerson extends PersonAbstract
{
void eat()
{
System.out.println("Eating pizza.");
}
void exercise()
{
System.out.println("Watching TV.");
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
