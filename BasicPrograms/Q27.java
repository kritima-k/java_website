package BasicPrograms;

import java.util.Scanner;

// Program to calculate the area of a circle
class AreaOfCircle
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking radius as input
System.out.println("Enter radius of circle:");
double radius = sc.nextDouble();

// calculating area using pi*r*r
double area = Math.PI * radius * radius;

// displaying the area
System.out.println("Area of circle = " + area);

sc.close();
}
}