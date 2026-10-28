package StringPrograms;
import java.util.Scanner;
class SplitString 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
// taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
// splitting string into substrings
String[] words = str.split(" ");
 // displaying the substrings
System.out.println("Substrings are:");
for (int i = 0; i < words.length; i++) {
System.out.println(words[i]);
}
 sc.close();
}
}
