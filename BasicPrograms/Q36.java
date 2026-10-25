package BasicPrograms;

import java.util.Scanner;

// Program to print Fibonacci series
class FibonacciSeries
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number of terms as input
System.out.println("Enter number of terms:");
int n = sc.nextInt();

int a = 0;
int b = 1;

// printing Fibonacci series
System.out.println("Fibonacci Series:");

for(int i = 1; i <= n; i++)
{
System.out.print(a + " ");

int c = a + b;
a = b;
b = c;
}

sc.close();
}
}