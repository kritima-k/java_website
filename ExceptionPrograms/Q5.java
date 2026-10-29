package exception_handling;
//this class demonstrates a nested try block
public class Q5
{
public static void main(String[] args)
{
int[] numbers = {10, 20, 30, 40};
//outer try block
try
{
System.out.println("Outer try block");
//inner try block
try
{
//accessing an invalid array index
System.out.println(numbers[5]);
}

//inner catch block handling array index exception
catch (ArrayIndexOutOfBoundsException e)
{
System.out.println("Caught an array index error");
}
System.out.println("completed");
}
//outer catch block handling exceptions
catch (Exception e)
{
System.out.println("Caught an error: " + e.getMessage());
}
}
}
