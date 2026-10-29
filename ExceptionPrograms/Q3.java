package exception_handling;
public class Q3
{
//this method declares an exception using throws
static void checkNumber() throws ArithmeticException
{
//throwing an exception
throw new ArithmeticException("Arithmetic error occurred");
}
public static void main(String[] args)
{
//try block calling the method that might throw an exception
try 
{
checkNumber();
}
 //catch block catching the exception
catch (ArithmeticException e)
{
System.out.println("Caught an error: " + e.getMessage());
}

}
}