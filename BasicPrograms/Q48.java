package BasicPrograms;

import java.util.Scanner;

// Program to count the number of digits in a number
class CountDigits
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int count = 0;

// counting the digits
if(n == 0)
{
count = 1;
}
else
{
n = Math.abs(n);

while(n > 0)
{
count++;
n = n / 10;
}
}

// displaying the count
System.out.println("Number of digits = " + count);

sc.close();
}
}