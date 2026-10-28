package StringPrograms ;
import java.util.Scanner;

class str_immutable
{
public static void main(String[] args )    
{
Scanner sc = new Scanner(System.in);
//taking inout from user 
System.out.println("enter a string ");
String str = sc.nextLine();
  // original string   
System.out.println("Original string: " + str);
 // trying to add text to the string
str.concat(" Java");
// trying to add text to the string
 str.concat(" Java");

// printing string after changes
System.out.println("After modification: " + str);
sc.close();

}
}