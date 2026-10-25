package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is automorphic or not
class AutomorphicNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int square = n * n;
int temp = n;
boolean automorphic = true;

// checking automorphic number
while(temp > 0)
{
if(temp % 10 != square % 10)
{
automorphic = false;
break;
}

temp = temp / 10;
square = square / 10;
}

// displaying the result
if(automorphic)
{
System.out.println("Automorphic number");
}
else
{
System.out.println("Not an automorphic number");
}

sc.close();
}
}