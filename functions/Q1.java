package functions;
public class Q1
{
static void smallest(int a, int b, int c)
{
if(a < b && a < c)
{
System.out.println("Smallest number is "+a);
}
else if(b < a && b < c)
{
System.out.println("Smallest number is "+b);
}
else
{
System.out.println("Smallest number is "+c);
}
}

public static void main(String[] args)
{
smallest(10,5,8);
}
}
