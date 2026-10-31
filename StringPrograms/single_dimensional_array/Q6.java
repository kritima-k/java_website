
package single_dimensional_array;

class ReversePrint
{
public static void main(String[] args)
{
//array with some numbers
int[] arr = {10, 20, 30, 40, 50};

//starting from the last index and going down to 0
for (int i = arr.length - 1; i >= 0; i--)
{
System.out.println(arr[i]);
}
}
}