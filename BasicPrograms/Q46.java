package BasicPrograms;

import java.util.Scanner;

// Program to calculate sum of natural numbers
class SumOfNaturalNumbers
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int sum = 0;

// calculating sum of natural numbers
for(int i = 1; i <= n; i++)
{
sum = sum + i;
}

// displaying the sum
System.out.println("Sum = " + sum);

sc.close();
}
}