package StringPrograms;

import java.util.Scanner;

class StringBufferReverse
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
// taking a string
System.out.println("Enter a string:");
 String str = sc.nextLine();
// creating an object of StringBuffer
StringBuffer sb = new StringBuffer(str);
 // reversing the string
 sb.reverse();
 // displaying the reversed string
System.out.println("Reversed string: " + sb);
 sc.close();
 }
}