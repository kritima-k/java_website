package input_output ;
import java.io.*;
public class Q1
{
public static void main(String[] st ) throws IOException
{

//making object to read input from the keyboard
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// taking a string from the user
System.out.println("Enter a string:");
String str = br.readLine();
// displaying the string
System.out.println("String is: " + str);

}
}