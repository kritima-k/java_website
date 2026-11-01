package exception_handling;
public class Q4
{
public static void main(String[] args)
{
try
{
int result = 10 / 0;
}
catch (ArithmeticException e)
{
System.out.println("Caught an arithmetic error");
}
finally
{
System.out.println("Finally block executed");
}
}
}


