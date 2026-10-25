package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is Armstrong or not
class ArmstrongNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int temp = n;
int sum = 0;

// calculating sum of cubes of digits
while(temp > 0)
{
int digit = temp % 10;
sum = sum + digit * digit * digit;
temp = temp / 10;
}

// checking Armstrong number
if(sum == n)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not an Armstrong number");
}

sc.close();
}
}