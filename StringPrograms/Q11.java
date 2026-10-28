package StringPrograms;

import java.util.Scanner;

class CountWords
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 // taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
 // splitting the string into words
 String[] words = str.trim().split("\\s+");
// displaying the number of words
System.out.println("Total words: " + words.length);
sc.close();
}
}
