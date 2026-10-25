package BasicPrograms;

import java.util.Scanner;

// Program to reverse a number
class ReverseNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int reverse = 0;

// reversing the number
while(n > 0)
{
int digit = n % 10;
reverse = reverse * 10 + digit;
n = n / 10;
}

// displaying the reversed number
System.out.println("Reversed number = " + reverse);

sc.close();
}
}