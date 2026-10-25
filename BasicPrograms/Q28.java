package BasicPrograms;

import java.util.Scanner;

// Program to calculate the area of a rectangle
class AreaOfRectangle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking length and breadth as input
System.out.println("Enter length:");
double length = sc.nextDouble();

System.out.println("Enter breadth:");
double breadth = sc.nextDouble();

// calculating area using length * breadth
double area = length * breadth;

// displaying the area
System.out.println("Area of rectangle = " + area);

sc.close();
}
}