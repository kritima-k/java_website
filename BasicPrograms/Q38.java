package BasicPrograms;

import java.util.Scanner;

// Program to calculate sum of digits of a number
class SumOfDigits
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int sum = 0;

// calculating sum of digits
while(n > 0)
{
int digit = n % 10;
sum = sum + digit;
n = n / 10;
}

// displaying the sum
System.out.println("Sum of digits = " + sum);

sc.close();
}
}