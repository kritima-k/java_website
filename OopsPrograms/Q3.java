package oops_programs;

// Program to calculate the area and perimeter of a rectangle
class Rectangle
{
double width;
double height;

// Constructor to initialize width and height
Rectangle(double width, double height)
{
this.width = width;
this.height = height;
}

// Method to calculate area
double calculateArea()
{
return width * height;
}

// Method to calculate perimeter
double calculatePerimeter()
{
return 2 * (width + height);
}

// Main method
public static void main(String[] st)
{
// Create a Rectangle object
Rectangle R = new Rectangle(10, 5);

// Display area and perimeter
System.out.println("Area of Rectangle: " + R.calculateArea());
System.out.println("Perimeter of Rectangle: " + R.calculatePerimeter());
}
}

