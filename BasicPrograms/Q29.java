package BasicPrograms;

import java.util.Scanner;

// Program to calculate the area of a triangle
class AreaOfTriangle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking base and height as input
System.out.println("Enter base of triangle:");
double base = sc.nextDouble();

System.out.println("Enter height of triangle:");
double height = sc.nextDouble();

// calculating area using 1/2 * base * height
double area = 0.5 * base * height;

// displaying the area
System.out.println("Area of triangle = " + area);

sc.close();
}
}