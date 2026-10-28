package StringPrograms;
import java.util.Scanner;
class Even_len_words
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
// taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
// splitting string into words
String[] words = str.split("\\s+");
// checking length of each word
 System.out.println("Even length words:");
for (int i = 0; i < words.length; i++) {
if (words[i].length() % 2 == 0)
{
System.out.println(words[i]);
}
}
sc.close();
}
}
