package input_output;
import java.util.Scanner;
public class Q2
{
public static void main(String[] args)
{
// object to take input from the user
Scanner sc = new Scanner(System.in);
// taking an integer from the user
System.out.println("Enter an integer:");
int num = sc.nextInt();
// displaying the integer
System.out.println("Integer is: " + num);
sc.close();
}
}
