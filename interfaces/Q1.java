package interfaces;

// an interface just says what methods a class must have
interface Shape 
{
double getArea(); // every shape must be able to give its area
}

// Rectangle implements Shape so it must provide code for getArea
class Rectangle implements Shape 
{
double length, width;

Rectangle(double length, double width)
{
this.length = length;
this.width = width;
}

public double getArea() 
{
return length * width;
}
}

class Circle implements Shape 
{
double radius;

Circle(double radius) 
{
this.radius = radius;
}

public double getArea() 
{
return Math.PI * radius * radius;
}
}

class Triangle implements Shape 
{
double base, height;

Triangle(double base, double height) 
{
this.base = base;
this.height = height;
}

public double getArea() 
{
return 0.5 * base * height;
}
}

 class ShapeInterface {
public static void main(String[] args) 
{
Shape rect = new Rectangle(5, 4); 
Shape circle = new Circle(3);
Shape triangle = new Triangle(6, 4);

System.out.println("Rectangle area: " + rect.getArea());
System.out.println("Circle area: " + circle.getArea());
System.out.println("Triangle area: " + triangle.getArea());
}
}