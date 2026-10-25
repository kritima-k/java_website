
package oops_programs;

// Abstract class for all shapes
abstract class Shape
{
// Abstract method for calculating area
abstract double calculateArea();

// Abstract method for calculating perimeter
abstract double calculatePerimeter();
}

// Rectangle class inherit properties from shape class
class Rectangle extends Shape
{
double length;
double width;

// Constructor to give values to length and width
Rectangle(double length, double width)
{
this.length = length;
this.width = width;
}

// Calculate area of rectangle
double calculateArea()
{
return length * width;
}

// Calculate perimeter of rectangle
double calculatePerimeter()
{
return 2 * (length + width);
}
}

// Circle class inherit properties from shape class
class Circle extends Shape
{
double radius;

// Constructor to give value to radius
Circle(double radius)
{
this.radius = radius;
}

// Calculate area of circle
double calculateArea()
{
return Math.PI * radius * radius;
}

// Calculate perimeter of circle
double calculatePerimeter()
{
return 2 * Math.PI * radius;
}
}
// triangle class inherit properties from shape class
class Triangle extends Shape
{
double a;
double b;
double c;
double height;

// Constructor to give values to triangle
Triangle(double a, double b, double c, double height)
{
this.a = a;
this.b = b;
this.c = c;
this.height = height;
}

// Calculate area of triangle
double calculateArea()
{
return 0.5 * a * height;
}

// Calculate perimeter of triangle
double calculatePerimeter()
{
return a + b + c;
}
}


class ShapeProgram
{
public static void main(String[] args)
{
// Create a rectangle
Rectangle rectangle = new Rectangle(10, 5);

System.out.println("Rectangle Area: " + rectangle.calculateArea());
System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

// Create a circle
Circle circle = new Circle(7);

System.out.println("Circle Area: " + circle.calculateArea());
System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

// Create a triangle
Triangle triangle = new Triangle(6, 5, 4, 4);

System.out.println("Triangle Area: " + triangle.calculateArea());
System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
}
}

