package StringPrograms;

import java.util.Scanner;

class AddCharacters
 {
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter a string:");
StringBuffer str = new StringBuffer(sc.nextLine());

System.out.println("Enter character to add:");
char ch = sc.next().charAt(0);

System.out.println("Enter position to add:");
int pos = sc.nextInt();

str.insert(pos, ch);

 System.out.println("After adding character: " + str);
 sc.close();
}
}