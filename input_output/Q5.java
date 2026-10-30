package input_output;
import java.util.Scanner;
public class Q5
{
public static void main(String[] args)
{
// object to take input from the user
Scanner sc = new Scanner(System.in);
// taking a boolean from the user
System.out.println("Enter a boolean value :");
boolean value = sc.nextBoolean();
 // displaying the boolean value
System.out.println("Boolean is: " + value);
sc.close();
}
}
