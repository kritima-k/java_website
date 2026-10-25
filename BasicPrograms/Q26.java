package BasicPrograms;

import java.util.Scanner;

// Program to find the sum of all digits of a positive integer
class SumOfAllDigits
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking a positive integer as input
System.out.println("Enter a positive integer:");
int number = sc.nextInt();

int sum = 0;

// extracting each digit and adding it to sum
while(number != 0)
{
int digit = number % 10;
sum = sum + digit;
number = number / 10;
}

// displaying the sum of digits
System.out.println("Sum of digits = " + sum);

sc.close();
}
}