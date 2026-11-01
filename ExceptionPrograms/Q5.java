package exception_handling;
public class Q5
{
static void checkNumber(int num) throws ArithmeticException
{
if (num < 0)
{
throw new ArithmeticException("Negative number not allowed");
}
System.out.println("Number is: " + num);
}
public static void main(String[] args)
{
try
{
checkNumber(-5);
}
catch (ArithmeticException e)
{
System.out.println("Caught an error: " + e.getMessage());
}
}
}
