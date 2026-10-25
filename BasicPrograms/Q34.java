package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is perfect or not
class PerfectNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int sum = 0;

// calculating sum of factors
for(int i = 1; i < n; i++)
{
if(n % i == 0)
{
sum = sum + i;
}
}

// checking perfect number
if(sum == n && n > 0)
{
System.out.println("Perfect number");
}
else
{
System.out.println("Not a perfect number");
}

sc.close();
}
}