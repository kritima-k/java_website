package BasicPrograms;

import java.util.Scanner;

// Program to check whether a number is palindrome or not
class PalindromeNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking number as input
System.out.println("Enter a number:");
int n = sc.nextInt();

int temp = n;
int reverse = 0;

// reversing the number
while(temp > 0)
{
int digit = temp % 10;
reverse = reverse * 10 + digit;
temp = temp / 10;
}

// checking palindrome number
if(reverse == n)
{
System.out.println("Palindrome number");
}
else
{
System.out.println("Not a palindrome number");
}

sc.close();
}
}