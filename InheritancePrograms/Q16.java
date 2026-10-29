package inheritance;

// abstract class saying every shape must be able to calculate area and perimeter
abstract class ShapeAbstract 
{
abstract double calculateArea();
abstract double calculatePerimeter();
}

// CircleShape gives the real formulas for a circle
class CircleShape extends ShapeAbstract
{
double radius;

CircleShape(double radius) 
{
this.radius = radius;
}

double calculateArea() 
{
return Math.PI * radius * radius;
}

double calculatePerimeter() 
{
return 2 * Math.PI * radius;
}
}

// TriangleShape gives the real formulas for a triangle
class TriangleShape extends ShapeAbstract 
{
double base, height, side1, side2, side3;

TriangleShape(double base, double height, double side1, double side2, double side3) {
this.base = base;
this.height = height;
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}

double calculateArea()
{
return 0.5 * base * height;
}

double calculatePerimeter() 
{
return side1 + side2 + side3;
}
}

class ShapeAreaPerimeterAbstract 
{
public static void main(String[] args) 
{
CircleShape circle = new CircleShape(5);
TriangleShape triangle = new TriangleShape(6, 4, 5, 5, 6);

System.out.println("Circle area: " + circle.calculateArea());
System.out.println("Circle perimeter: " + circle.calculatePerimeter());

System.out.println("Triangle area: " + triangle.calculateArea());
System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
}
}