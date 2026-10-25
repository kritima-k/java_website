package inheritance;

// Shape is the parent class, area is 0 by default since it has no shape yet
class Shape {
double getArea() {
return 0;
}
}

// Rectangle extends Shape and adds its own length and width
class Rectangle extends Shape {
double length;
double width;

// constructor runs when a Rectangle object is created, sets its size
Rectangle(double length, double width) {
this.length = length;
this.width = width;
}

// overriding getArea so it actually calculates area for a rectangle
double getArea() {
return length * width;
}
}

 class ShapeAreaOverride {
public static void main(String[] args) {
Rectangle myRectangle = new Rectangle(5, 3); // rectangle with length 5, width 3
System.out.println("Area of rectangle: " + myRectangle.getArea());
}
}