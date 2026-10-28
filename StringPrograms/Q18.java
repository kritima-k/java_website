package StringPrograms;
import java.util.Scanner;

class LargestSmallestWord
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
// taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
// splitting string into words
String[] words = str.trim().split("\\s+");
 // assuming first word is largest and smallest
String largest = words[0];
String smallest = words[0];
// comparing the length of words
for (int i = 1; i < words.length; i++)
{
if (words[i].length() > largest.length())
{
largest = words[i];
}

if (words[i].length() < smallest.length()) 
{
smallest = words[i];
}
}

 // displaying largest and smallest words
 System.out.println("Largest word: " + largest);
System.out.println("Smallest word: " + smallest);

        sc.close();
    }
}
