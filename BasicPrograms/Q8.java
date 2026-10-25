package BasicPrograms;

import java.util.Scanner;

// Program to convert binary number to decimal
class BinaryToDecimal
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking binary number as input
System.out.println("Enter a binary number:");
String binary = sc.nextLine();

// converting binary to decimal
int decimal = Integer.parseInt(binary, 2);

// displaying result
System.out.println("Decimal number = " + decimal);

sc.close();
}
}