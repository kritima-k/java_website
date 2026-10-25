package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is strong or not
class StrongNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int temp = n;
int sum = 0;

// calculating sum of factorials of digits
while(temp > 0)
{
int digit = temp % 10;
int fact = 1;

for(int i = 1; i <= digit; i++)
{
fact = fact * i;
}

sum = sum + fact;
temp = temp / 10;
}

// checking strong number
if(sum == n && n >= 0)
{
System.out.println("Strong number");
}
else
{
System.out.println("Not a strong number");
}

sc.close();
}
}