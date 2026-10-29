package exception_handling;

public class Q1
{
public static void main(String[] args) 
{
// Array containing only 4 elements valid index 0,1,2,3
int[] numbers = {10, 20, 30, 40};
// The try block contains code that may potentially throw an exception.
// If an error occurs here, control immediately transfers to the catch block.
try 
{
// Accessing an invalid array index to throw an exception
System.out.println(numbers[5]);
}
catch (ArrayIndexOutOfBoundsException e) 
{
// Handling the exception and displaying the error message
System.out.println("Exception caught: " + e);
}
// Execution continues here regardless of whether an exception occurred

}
}