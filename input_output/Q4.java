package input_output;
import java.util.Scanner;

public class Q4
{
public static void main(String[] args)
{
// object to take input from the user
Scanner sc = new Scanner(System.in);
// taking a double from the user
System.out.println("Enter a double:");
double num = sc.nextDouble();
 // displaying the double
System.out.println("Double is: " + num);
// closing the scanner
sc.close();
}
}
