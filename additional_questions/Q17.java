package additional_questions;
abstract class Shape
{
abstract void area();
}
class Rectangle extends Shape
{
int length = 10;
int breadth = 5;

void area()
{
System.out.println("Area of Rectangle: " + (length * breadth));
}
}
public class Q17
{
public static void main(String[] args)
{
Shape s = new Rectangle();
s.area();
}
}
