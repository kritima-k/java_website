package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is divisible by 5 and 11
class DivisibleBy5And11
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

// checking divisibility
if(n % 5 == 0 && n % 11 == 0)
{
System.out.println("Number is divisible by 5 and 11");
}
else
{
System.out.println("Number is not divisible by 5 and 11");
}

sc.close();
}
}