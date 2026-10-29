package exception_handling;
//this class demonstrates multiple catch blocks
public class Q4
{
public static void main(String[] args)
{
//array containing 4 elements
int[] numbers = {10, 20, 30, 40};
//try block containing code that may throw an exception
try
{
int result = 10 / 0;
System.out.println(numbers[5]);
}
//catch block handling arithmetic exception
catch (ArithmeticException e) 
{
System.out.println("Caught an arithmetic error");
}
//catch block handling array index exception
catch (ArrayIndexOutOfBoundsException e) 
{
System.out.println("Caught an array index error");
}

}
}