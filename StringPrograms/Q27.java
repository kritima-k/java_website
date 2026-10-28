package StringPrograms;

import java.util.Scanner;

class Reverse_str
 {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);

 // taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
// creating an empty string
String rev = "";
 // reversing the string without reverse() function
 for (int i = str.length() - 1; i >= 0; i--) {
 rev = rev + str.charAt(i);
}
 // displaying the reversed string
System.out.println("Reversed string: " + rev);
 sc.close();
}
}
