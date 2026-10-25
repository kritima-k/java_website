package oops_programs;

// This class calculates areas
class Area
{
// Calculate area of a circle
double calculateArea(double radius)
{
return 3.14 * radius * radius;
}

// Calculate area of a rectangle
double calculateArea(double length, double breadth)
{
return length * breadth;
}
}

class AreaOverload
{
public static void main(String[] args)
{
Area a = new Area();

// Calculate area of circle
System.out.println("Area of Circle: " + a.calculateArea(5));

// Calculate area of rectangle
System.out.println("Area of Rectangle: " + a.calculateArea(10, 5));
}
}

