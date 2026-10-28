package StringPrograms;
import java.util.Scanner;

class CountCharacters 
{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 // taking a string
System.out.println("Enter a string:");
String str = sc.nextLine();
// counting characters
System.out.println("Total characters: " + str.length());
 sc.close();
  
  }
}
