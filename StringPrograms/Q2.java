package StringPrograms ;
import java.util.Scanner ;

class deep_copy
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
  // taking string from user
System.out.println("enter a string");
String str = sc.nextLine();
String copy = new String(str);   // creating a copy of the string
System.out.println("orignal string :"+str);
System.out.println("copied string :"+copy);
sc.close();
}
}