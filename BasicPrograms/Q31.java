package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is prime
class PrimeNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

boolean prime = true;

// checking whether number is prime
if(n <= 1)
{
prime = false;
}
else
{
for(int i = 2; i <= Math.sqrt(n); i++)
{
if(n % i == 0)
{
prime = false;
break;
}
}
}

// displaying the result
if(prime)
{
System.out.println("Prime number");
}
else
{
System.out.println("Not a prime number");
}

sc.close();
}
}