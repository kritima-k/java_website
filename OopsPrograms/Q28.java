package oops_programs;

// This class stores rectangle dimensions
class Rectangle
{
private double length;
private double width;

// Setter methods
public void setLength(double l)
{
length = l;
}

public void setWidth(double w)
{
width = w;
}

// Getter methods
public double getLength()
{
return length;
}

public double getWidth()
{
return width;
}
}

class RectangleProgram
{
public static void main(String[] args)
{
Rectangle r = new Rectangle();

r.setLength(10);
r.setWidth(5);

System.out.println("Length: " + r.getLength());
System.out.println("Width: " + r.getWidth());
}
}

