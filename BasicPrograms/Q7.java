package BasicPrograms;

import java.util.Scanner;

// Program to convert decimal number to binary
class DecimalToBinary
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking decimal number as input
System.out.println("Enter a decimal number:");
int num = sc.nextInt();

// converting decimal to binary
String binary = Integer.toBinaryString(num);

// displaying result
System.out.println("Binary number = " + binary);

sc.close();
}
}