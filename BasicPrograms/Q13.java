package BasicPrograms;

import java.util.Scanner;

// Program to print the ASCII value of a character
class ASCIIValue
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

// taking character as input
System.out.println("Enter a character:");
char ch = sc.next().charAt(0);

// converting character to ASCII value
int ascii = (int) ch;

// displaying ASCII value
System.out.println("ASCII value = " + ascii);

sc.close();
}
}