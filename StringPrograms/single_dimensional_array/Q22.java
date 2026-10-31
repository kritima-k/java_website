
package single_dimensional_array;

class OddEvenPrint
{
public static void main(String[] args)
{
//original array with mixed odd and even numbers
int[] arr = {10, 15, 20, 25, 30, 35};

//printing all even numbers first
System.out.println("Even numbers:");
for (int i = 0; i < arr.length; i++)
{
if (arr[i] % 2 == 0)
{
System.out.println(arr[i]);
}
}

//printing all odd numbers
System.out.println("Odd numbers:");
for (int i = 0; i < arr.length; i++)
{
if (arr[i] % 2 != 0)
{
System.out.println(arr[i]);
}
}
}
}