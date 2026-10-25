package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is positive, negative or zero
class PositiveNegativeZero
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

// checking the number
if(n > 0)
{
System.out.println("Positive number");
}
else if(n < 0)
{
System.out.println("Negative number");
}
else
{
System.out.println("Zero");
}

sc.close();
}
}