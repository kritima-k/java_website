package BasicPrograms;

import java.util.Scanner;

// Program to check whether a positive number is a palindrome
class PalindromeNumber
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking a positive number as input
System.out.println("Enter a positive number:");
int number = sc.nextInt();

int original = number;
int reverse = 0;

// reversing the number
while(number != 0)
{
int digit = number % 10;
reverse = reverse * 10 + digit;
number = number / 10;
}

// comparing original and reversed number
if(original == reverse)
{
System.out.println("The number is a palindrome");
}
else
{
System.out.println("The number is not a palindrome");
}

sc.close();
}
}