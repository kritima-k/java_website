package BasicPrograms;

import java.util.Scanner;

// Program to convert a string value into an integer
class StringToInteger
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking a number in string form as input
System.out.println("Enter a number:");
String str = sc.nextLine();

// converting the string into an integer
int number = Integer.parseInt(str);

// displaying the converted integer
System.out.println("Integer value = " + number);

sc.close();
}
}