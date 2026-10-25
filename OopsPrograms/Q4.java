package oops_programs;

// Program to access and modify the radius and calculate area and circumference

class Circle
{
// Attribute of Circle
double radius;

// Constructor to initialize radius
Circle(double radius)
{
this.radius = radius;
}

// Getter method to access the radius
double getRadius()
{
return radius;
}

// Setter method to modify the radius
void setRadius(double radius)
{
this.radius = radius;
}

// Method to calculate the area
double calculateArea()
{
return Math.PI * radius * radius;
}

// Method to calculate the circumference
double calculateCircumference()
{
return 2 * Math.PI * radius;
}

// Main method
public static void main(String[] st)
{
// Create a Circle object using the constructor
Circle C = new Circle(5);

// Display the original radius
System.out.println("Original Radius: " + C.getRadius());

// Modify the radius using the setter method
C.setRadius(7);

// Display the updated radius
System.out.println("Updated Radius: " + C.getRadius());

// Calculate and display the area
System.out.println("Area of Circle: " + C.calculateArea());

// Calculate and display the circumference
System.out.println("Circumference of Circle: " + C.calculateCircumference());
}
}