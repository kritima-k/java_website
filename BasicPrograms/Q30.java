package BasicPrograms;

import java.util.Scanner;

// Program to calculate the area of an equilateral triangle
class AreaOfEquilateralTriangle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking side of triangle as input
System.out.println("Enter side of triangle:");
double side = sc.nextDouble();

// calculating area of triangle
double area = (Math.sqrt(3) / 4) * side * side;

// displaying the area
System.out.println("Area of equilateral triangle = " + area);

sc.close();
}
}