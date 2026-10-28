package StringPrograms;
import java.util.Scanner;

class rem_occurance
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// taking string from user
System.out.println("Enter a string:");
String str = sc.nextLine();

// taking character to remove
System.out.println("Enter character to remove:");
char ch = sc.next().charAt(0);

// removing all occurrences of character
str = str.replace(String.valueOf(ch), "");
// displaying result
System.out.println(" after removing character: " + str);

sc.close();
}
}
