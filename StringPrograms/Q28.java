
package StringPrograms;

import java.util.Scanner;
import java.util.Arrays;

class SameCharacters
 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
// taking first string
 System.out.println("Enter first string:");
String str1 = sc.nextLine().toLowerCase();
 // taking second string
 System.out.println("Enter second string:");
String str2 = sc.nextLine().toLowerCase();
 // converting strings into character arrays
char[] arr1 = str1.toCharArray();
char[] arr2 = str2.toCharArray();
// sorting both arrays
 Arrays.sort(arr1);
 Arrays.sort(arr2);

 // checking whether both arrays are equal
if (Arrays.equals(arr1, arr2)) {
 System.out.println("Strings contain the same characters.");
 }
else 
{
System.out.println("Strings do not contain the same characters.");
}
 sc.close();
}
}
