package StringPrograms;


import java.util.Scanner;

class Palindrome 
{
 public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);

// taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();

 // storing the reverse string
 String rev = "";

 // reversing the string
 for (int i = str.length() - 1; i >= 0; i--)
  {
rev = rev + str.charAt(i);
 }
 // checking whether both strings are equal
if (str.equalsIgnoreCase(rev)) 
{
System.out.println("String is a palindrome.");
}
 else 
{
 System.out.println("String is not a palindrome.");
}

sc.close();
}
}
