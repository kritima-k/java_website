package BasicPrograms;

import java.util.Scanner;

// Program to find the largest of three numbers
class LargestOfThree
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking three numbers as input
System.out.println("Enter first number:");
int a = sc.nextInt();

System.out.println("Enter second number:");
int b = sc.nextInt();

System.out.println("Enter third number:");
int c = sc.nextInt();

// finding the largest number
if(a >= b && a >= c)
{
System.out.println("Largest number = " + a);
}
else if(b >= a && b >= c)
{
System.out.println("Largest number = " + b);
}
else
{
System.out.println("Largest number = " + c);
}

sc.close();
}
}