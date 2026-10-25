package BasicPrograms;

// Program to swap two variables
class SwapTwoVariables
{
public static void main(String[] args)
{
// declaring two variables
int a = 40;
int b = 80;

// using a temporary variable to swap values
int temp = a;
a = b;
b = temp;

// displaying swapped values
System.out.println("Value of a = " + a);
System.out.println("Value of b = " + b);
}
}