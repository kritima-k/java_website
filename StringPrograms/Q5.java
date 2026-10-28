package StringPrograms;

import java.util.Scanner;

class AppendString
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);

// taking string from user
 System.out.println("Enter a string:");
 StringBuffer str = new StringBuffer(sc.nextLine());

// taking text to append
System.out.println("Enter string to append:");
 String add = sc.nextLine();

// adding string at the end
str.append(add);

// displaying result
System.out.println("After appending: " + str);

sc.close();
}
}
