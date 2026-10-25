package BasicPrograms;

import java.util.Scanner;

// Program to calculate factorial of a number
class Factorial
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int fact = 1;

// calculating factorial
for(int i = 1; i <= n; i++)
{
fact = fact * i;
}

// displaying the factorial
System.out.println("Factorial = " + fact);

sc.close();
}
}