package BasicPrograms;

import java.util.Scanner;

// Program to compare two numbers
class CompareTwoNumbers
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking input from the user
System.out.println("Enter first number:");
int a = sc.nextInt();

System.out.println("Enter second number:");
int b = sc.nextInt();

// comparing the numbers
if(a > b)
{
System.out.println(a + " is greater than " + b);
}
else if(a < b)
{
System.out.println(a + " is smaller than " + b);
}
else
{
System.out.println("Both numbers are equal");
}

sc.close();
}
}