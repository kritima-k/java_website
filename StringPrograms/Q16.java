package StringPrograms;
import java.util.Scanner;
class Duplicate_char
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
// taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
// converting string to lowercase
str = str.toLowerCase();
 // displaying duplicate characters
System.out.println("Duplicate characters:");
// checking each character
for (int i = 0; i < str.length(); i++) 
{
 char ch = str.charAt(i);
int count = 0;
// counting occurrences of the character
for (int j = 0; j < str.length(); j++)
 {
if (str.charAt(j) == ch)
 {
count++;
}
}
// printing each duplicate character only once
if (count > 1 && str.indexOf(ch) == i) 
{
System.out.println(ch + " = " + count);
}
}
sc.close();
}
}
