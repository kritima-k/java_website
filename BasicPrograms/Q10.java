package BasicPrograms;

import java.util.Scanner;

// Program to find the sum of digits of an integer
class SumOfDigits
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter an integer:");
int num = sc.nextInt();

int sum = 0;

// calculating sum of digits
while(num != 0)
{
int digit = num % 10;
sum = sum + digit;
num = num / 10;
}

// displaying the sum
System.out.println("Sum of digits = " + sum);

sc.close();
}
}