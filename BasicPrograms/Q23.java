package BasicPrograms;

import java.util.Scanner;

// Program to calculate the square root of an integer
class SquareRoot
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking an integer as input
System.out.println("Enter a number:");
int number = sc.nextInt();

// calculating the square root
double result = Math.sqrt(number);

// displaying the square root
System.out.println("Square root = " + result);

sc.close();
}
}