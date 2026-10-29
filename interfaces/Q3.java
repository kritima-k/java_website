package interfaces;

// Flyable says any class implementing it must have a fly_obj method
interface Flyable 
{
void fly_obj();
}

class Spacecraft implements Flyable
 {
public void fly_obj()
 {
System.out.println("Spacecraft flies through space.");
}
}

class Airplane implements Flyable
{
public void fly_obj()
{
System.out.println("Airplane flies through the sky.");
}
}

class Helicopter implements Flyable 
{
public void fly_obj() 
{
System.out.println("Helicopter flies by spinning its rotors.");
}
}

 class FlyableInterface 
{
public static void main(String[] args)
{
Flyable spacecraft = new Spacecraft();
Flyable airplane = new Airplane();
Flyable helicopter = new Helicopter();

spacecraft.fly_obj();
airplane.fly_obj();
helicopter.fly_obj();
}
}