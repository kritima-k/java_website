package exception_handling;
public class Q3
{
static void checkNumber() throws ArithmeticException
{
throw new ArithmeticException("Arithmetic error occurred");
}
public static void main(String[] args)
{
try
{
checkNumber();
}
catch (ArithmeticException e)
{
System.out.println("Caught an error: " + e.getMessage());
}
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("Array error");
}
}
}
