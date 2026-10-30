package input_output;
import java.util.Scanner;

public class Q3
{
public static void main(String[] args)
{
// object to take input from the user
Scanner sc = new Scanner(System.in);
// taking a float from the user
System.out.println("Enter a float:");
float num = sc.nextFloat();
// displaying the float
System.out.println("Float is: " + num);
// closing the scanner
sc.close();
}
}
