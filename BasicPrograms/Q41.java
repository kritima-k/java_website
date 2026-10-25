package BasicPrograms;

import java.util.Scanner;

// Program to check whether a year is leap year or not
class LeapYear
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking year as input
System.out.println("Enter a year:");
int year = sc.nextInt();

// checking leap year
if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
{
System.out.println("Leap year");
}
else
{
System.out.println("Not a leap year");
}

sc.close();
}
}