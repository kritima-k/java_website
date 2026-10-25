package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is even or odd
class EvenOdd
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

// checking even or odd
if(n % 2 == 0)
{
System.out.println("Even number");
}
else
{
System.out.println("Odd number");
}

sc.close();
}
}