
package oops_programs;

// This class stores circle details
class Circle
{
private double radius;

// Setter method
public void setRadius(double r)
{
radius = r;
}

// Getter method
public double getRadius()
{
return radius;
}

// Calculate area
public double calculateArea()
{
return 3.14 * radius * radius;
}

// Calculate perimeter
public double calculatePerimeter()
{
return 2 * 3.14 * radius;
}
}

class CircleProgram
{
public static void main(String[] args)
{
Circle c = new Circle();

c.setRadius(5);

System.out.println("Radius: " + c.getRadius());
System.out.println("Area: " + c.calculateArea());
System.out.println("Perimeter: " + c.calculatePerimeter());
}
}
