package StringPrograms;
import java.util.Scanner;
class ToggleCase 
{
public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
// taking a string
 System.out.println("Enter a string:");
String str = sc.nextLine();
 // creating an empty string
String result = "";
// changing the case of each character
for (int i = 0; i < str.length(); i++) 
{
char ch = str.charAt(i);
if (Character.isUpperCase(ch)) 
{
result = result + Character.toLowerCase(ch);
}
 else if (Character.isLowerCase(ch))
{
result = result + Character.toUpperCase(ch);
}
 else 
 {
result = result + ch;
 }
}
// displaying the result
//  System.out.println("String after changing case: " + result);
sc.close();
}
}
