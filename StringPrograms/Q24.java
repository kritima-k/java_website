package StringPrograms;
import java.util.Scanner;
class ReplaceSpaces 
{
public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 // taking a string
 System.out.println("Enter a string:");
 String str = sc.nextLine();

 // taking the character to replace spaces
 System.out.println("Enter a character:");
 char ch = sc.next().charAt(0);
// replacing spaces with the given character
 String result = str.replace(' ', ch);
// displaying the result
System.out.println("String after replacing spaces: " + result);
sc.close();
 }
}
