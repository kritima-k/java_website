package StringPrograms;
import java.util.Scanner;
class Remove_spaces
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
 // taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
// removing all white spaces
String result = str.replaceAll("\\s", "");
// displaying the result
System.out.println("String without white spaces: " + result);
 sc.close();
}
}
