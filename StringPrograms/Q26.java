package StringPrograms;

import java.util.Scanner;

class SwapStrings
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// taking two strings
System.out.println("Enter first string:");
String str1 = sc.nextLine();

System.out.println("Enter second string:");
String str2 = sc.nextLine();
 // swapping two strings without a temporary variable
str1 = str1 + str2;
str2 = str1.substring(0, str1.length() - str2.length());
str1 = str1.substring(str2.length());

// displaying swapped strings
System.out.println("First string after swapping: " + str1);
System.out.println("Second string after swapping: " + str2);

sc.close();
}
}
