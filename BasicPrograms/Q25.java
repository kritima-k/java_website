package BasicPrograms;

import java.util.Scanner;

// Program to add two numbers without using arithmetic operators
class AddWithoutArithmeticOperator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking two numbers as input
System.out.println("Enter first number:");
int a = sc.nextInt();

System.out.println("Enter second number:");
int b = sc.nextInt();

// adding numbers using bitwise operators
while(b != 0)
{
int carry = a & b;
a = a ^ b;
b = carry << 1;
}

// displaying the sum
System.out.println("Sum = " + a);

sc.close();
}
}