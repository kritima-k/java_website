package StringPrograms;

import java.util.Scanner;

class InsertString {
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);

// taking original string
System.out.println("Enter a string:");
StringBuffer str = new StringBuffer(sc.nextLine());

 // taking string to insert
System.out.println("Enter string to insert:");
String add = sc.nextLine();

 // taking position
System.out.println("Enter position to insert:");
int pos = sc.nextInt();

// inserting string at the given position
 str.insert(pos, add);

// displaying result
System.out.println("After inserting: " + str);

 sc.close();
}
}
