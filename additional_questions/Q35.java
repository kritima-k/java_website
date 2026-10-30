package additional_questions ;

public class Q35
{
public static void main(String[] args)
{
try
{
int a = 10;
int b = 0;
int c = a / b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("Cannot divide by zero");
}
}
}
