package StringPrograms;
import java.util.Scanner;

class InsertString 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
// taking the original string
System.out.println("Enter the original string:");
String str = sc.nextLine();
// taking the string to insert
System.out.println("Enter the string to insert:");
String insert = sc.nextLine();
// taking the position
System.out.println("Enter the position to insert:");
int pos = sc.nextInt();
// inserting the string at the given position
String result = str.substring(0, pos) + insert + str.substring(pos);
// displaying the result
System.out.println("After inserting: " + result);
sc.close();
}
}
