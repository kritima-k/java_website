package inheritance;

// abstract class 
abstract class GeometricShape 
{
abstract double area();
abstract double perimeter();
}

class TriangleGeo extends GeometricShape 
{
double base, height, side1, side2, side3;

TriangleGeo(double base, double height, double side1, double side2, double side3) 
{
this.base = base;
this.height = height;
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
double area() 
{
return 0.5 * base * height;
}
double perimeter() 
{
return side1 + side2 + side3;
}
}
class SquareGeo extends GeometricShape 
{
double side;

SquareGeo(double side) 
{
this.side = side;
}

double area() 
{
return side * side;
}

double perimeter() 
{
return 4 * side;
}
}
class GeometricShapeAreaPerimeter 
{
public static void main(String[] args) 
{
TriangleGeo triangle = new TriangleGeo(6, 4, 5, 5, 6);
SquareGeo square = new SquareGeo(5);
System.out.println("Triangle area: " + triangle.area());
System.out.println("Triangle perimeter: " + triangle.perimeter());
System.out.println("Square area: " + square.area());
System.out.println("Square perimeter: " + square.perimeter());
}
}