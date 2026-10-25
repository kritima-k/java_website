package BasicPrograms;

import java.util.Scanner;

// Program to perform arithmetic operations using switch
class SimpleCalculator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking two numbers as input
System.out.println("Enter first number:");
double a = sc.nextDouble();

System.out.println("Enter second number:");
double b = sc.nextDouble();

// taking operator as input
System.out.println("Enter operator (+, -, *, /):");
char op = sc.next().charAt(0);

// performing calculation
switch(op)
{
case '+':
System.out.println("Result = " + (a + b));
break;

case '-':
System.out.println("Result = " + (a - b));
break;

case '*':
System.out.println("Result = " + (a * b));
break;

case '/':
if(b != 0)
{
System.out.println("Result = " + (a / b));
}
else
{
System.out.println("Division by zero is not possible");
}
break;

default:
System.out.println("Invalid operator");
}

sc.close();
}
}