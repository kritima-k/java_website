package StringPrograms;

import java.util.Scanner;
import java.util.Arrays;

class Anagram 
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

 System.out.println("Enter first string:");
 String str1 = sc.nextLine();

 System.out.println("Enter second string:");
 String str2 = sc.nextLine();
//  here converting strings into character arrays
char[] arr1 = str1.toLowerCase().toCharArray();
char[] arr2 = str2.toLowerCase().toCharArray();
 // sorting both arrays
 Arrays.sort(arr1);
Arrays.sort(arr2);

// checking whether both arrays are equal
if (Arrays.equals(arr1, arr2)) 
{
 System.out.println("Strings are anagrams.");
} else
{
 System.out.println("Strings are not anagrams.");
}

sc.close();
}
}