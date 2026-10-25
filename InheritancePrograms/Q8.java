package inheritance;

// Shape2 is the parent class, no real shape yet so values are 0
class Shape2 {
double getPerimeter() {
return 0;
}

double getArea() {
return 0;
}
}

// Circle extends Shape2 and actually calculates real values for a circle
class Circle extends Shape2 {
double radius;

Circle(double radius) {
this.radius = radius;
}

// overriding to give the real formula for a circle's perimeter
double getPerimeter() {
return 2 * Math.PI * radius;
}

// overriding to give the real formula for a circle's area
double getArea() {
return Math.PI * radius * radius;
}
}

class ShapeCirclePerimeterArea {
public static void main(String[] args) {
Circle myCircle = new Circle(4); // circle with radius 4
System.out.println("Perimeter: " + myCircle.getPerimeter());
System.out.println("Area: " + myCircle.getArea());
}
}